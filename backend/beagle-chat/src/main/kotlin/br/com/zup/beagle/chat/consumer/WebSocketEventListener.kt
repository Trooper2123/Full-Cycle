package br.com.zup.beagle.chat.consumer

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.stereotype.Component
import org.springframework.web.socket.messaging.SessionConnectedEvent
import org.springframework.web.socket.messaging.SessionDisconnectEvent
import java.sql.DriverManager.println


@Component
class WebSocketEventListener {
    @Autowired(required = true)
    val messagingTemplate: SimpMessageSendingOperations? = null

    @EventListener
    fun handleWebSocketConnectListener(event: SessionConnectedEvent?) {
        println("Received a new web socket connection")
    }

    @EventListener
    fun handleWebSocketDisconnectListener(event: SessionDisconnectEvent) {
        val headerAccessor = StompHeaderAccessor.wrap(event.message)
        val username = headerAccessor.sessionAttributes!!["username"] as String?
        if (username != null) {
            val chatMessage = WebSocketChatMessage()
            chatMessage.type = "Leave"
            chatMessage.sender = username
            messagingTemplate!!.convertAndSend("/topic/beagle-chat", chatMessage)
        }
    }
}