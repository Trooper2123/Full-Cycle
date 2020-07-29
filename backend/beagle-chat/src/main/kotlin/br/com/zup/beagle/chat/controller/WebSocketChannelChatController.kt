package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.web.bind.annotation.RestController
import java.lang.String.format


@RestController
class WebSocketChannelChatController {

    private val logger: Logger = LoggerFactory.getLogger(WebSocketChannelChatController::class.java)

    @Autowired
    private val messagingTemplate: SimpMessageSendingOperations? = null


    @MessageMapping("/chat/{channelName}/sendMessage")
    fun sendMessage(@DestinationVariable channelName: String, @Payload chatMessage: WebSocketChatMessage) {
        logger.info(channelName + " Chat message Recived is "+ chatMessage.content)
        messagingTemplate?.convertAndSend(format("/topic/%s",channelName),chatMessage)

    }

    @MessageMapping("/chat/{channelName}/addUser")
    fun addUser(@DestinationVariable channelName: String, @Payload chatMessage: WebSocketChatMessage,
                headerAccessor: SimpMessageHeaderAccessor) {
        val currentChannel = headerAccessor.sessionAttributes?.put("channel_name", channelName) as String?
        if (currentChannel != null) {
            val leaveMessage = WebSocketChatMessage()
            leaveMessage.type = "Leave"
            leaveMessage.sender
            messagingTemplate?.convertAndSend(format("/topic/%s", currentChannel), leaveMessage)
        }
        headerAccessor.sessionAttributes?.put("name",chatMessage.sender)
        messagingTemplate?.convertAndSend(format("/topic/%s",channelName), chatMessage)
    }
}
