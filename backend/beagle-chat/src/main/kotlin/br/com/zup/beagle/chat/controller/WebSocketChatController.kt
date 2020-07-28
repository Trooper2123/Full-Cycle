package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.web.bind.annotation.RestController
import java.text.MessageFormat.format

@RestController
class WebSocketChatController {

    private val logger: org.slf4j.Logger? = org.slf4j.LoggerFactory.getLogger(WebSocketChatController::class.java)

    @Autowired
    private val messagingTemplate: SimpMessageSendingOperations? = null

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

}
