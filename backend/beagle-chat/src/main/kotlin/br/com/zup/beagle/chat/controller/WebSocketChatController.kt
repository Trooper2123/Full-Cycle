package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class WebSocketChatController {
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
