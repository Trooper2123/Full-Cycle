package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.web.bind.annotation.RestController


@RestController
class WebSocketSimpleChatController {
    private val logger: Logger = LoggerFactory.getLogger(WebSocketSimpleChatController::class.java)



    @MessageMapping("/sendMessage")
    @SendTo("/topic/beagle-chat")
    fun sendMessage( @Payload webSocketChatMessage: WebSocketChatMessage): WebSocketChatMessage {
        logger.info( "Message Recived from : "+ webSocketChatMessage.sender +
                " Message content: "+ webSocketChatMessage.content )
        return webSocketChatMessage
    }

    @MessageMapping("/newUser")
    @SendTo("/topic/beagle-chat")
    fun newUser(@Payload webSocketChatMessage: WebSocketChatMessage, headerAccessor: SimpMessageHeaderAccessor): WebSocketChatMessage {
        headerAccessor.sessionAttributes?.put("username", webSocketChatMessage.sender)
        return webSocketChatMessage
    }


}