package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.web.bind.annotation.RestController
import java.lang.String.format


@RestController
class WebSocketChatController {

    private val logger: Logger = LoggerFactory.getLogger(WebSocketChatController::class.java)

    @Autowired
    private val messagingTemplate: SimpMessageSendingOperations? = null

    // all users in the same room

    @MessageMapping("/sendMessage")
    @SendTo("/topic/beagle-chat")
    fun sendMessage(@Payload webSocketChatMessage: WebSocketChatMessage): WebSocketChatMessage {
        return webSocketChatMessage
    }

    @MessageMapping("/newUser")
    @SendTo("/topic/beagle-chat")
    fun newUser(@Payload webSocketChatMessage: WebSocketChatMessage, headerAccessor: SimpMessageHeaderAccessor): WebSocketChatMessage {
        headerAccessor.sessionAttributes?.put("username", webSocketChatMessage.sender)
        return webSocketChatMessage
    }

    //Chat Room path

    @MessageMapping("/chat/{roomId}/sendMessage")
    fun sendMessage(@DestinationVariable roomId: String, @Payload chatMessage: WebSocketChatMessage) {
        logger.info(roomId + "Chat message Recived is"+ chatMessage.content)
        messagingTemplate?.convertAndSend(format("/topic/%s",roomId),chatMessage)

    }

    @MessageMapping("/chat/{roomId}/addUser")
    fun addUser(@DestinationVariable roomId: String, @Payload chatMessage: WebSocketChatMessage,
                headerAccessor: SimpMessageHeaderAccessor) {
        val currentRoomId = headerAccessor.sessionAttributes?.put("room_id",roomId) as String
        if(currentRoomId != null){
            val leaveMessage = WebSocketChatMessage()
            leaveMessage.type = "Leave"
            leaveMessage.sender
            messagingTemplate!!.convertAndSend(format("/topic/%s",currentRoomId),leaveMessage)
        }
        headerAccessor.sessionAttributes?.put("name",chatMessage.sender)
        messagingTemplate?.convertAndSend(format("/topic/%s",roomId),chatMessage)
    }
}
