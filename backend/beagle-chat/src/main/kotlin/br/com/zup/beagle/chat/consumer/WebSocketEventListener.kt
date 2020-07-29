package br.com.zup.beagle.chat.consumer

import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.stereotype.Component
import org.springframework.web.socket.messaging.SessionConnectedEvent
import org.springframework.web.socket.messaging.SessionDisconnectEvent
import java.text.MessageFormat.format


@Component
class WebSocketEventListener {

    private val logger: Logger = LoggerFactory.getLogger(WebSocketEventListener::class.java)

    @Autowired
    val messagingTemplate: SimpMessageSendingOperations? = null

    @EventListener
    fun handleWebSocketConnectListener(event: SessionConnectedEvent?) {
        logger.info("Received a new web socket connection")
    }

    @EventListener
    fun handleWebSocketDisconnectListener(event: SessionDisconnectEvent) {
        val headerAccessor = StompHeaderAccessor.wrap(event.message)
        val username = headerAccessor.sessionAttributes?.get("username") as String?
        val channelName = headerAccessor.sessionAttributes?.get("channel_name") as String?
        if (username != null) {
            logger.info("User Disconnected $username")
            val chatMessage = WebSocketChatMessage()
            chatMessage.type = "Leave"
            chatMessage.sender = username
            messagingTemplate?.convertAndSend(format("/channel/%s", channelName), chatMessage)
        }
    }
}
