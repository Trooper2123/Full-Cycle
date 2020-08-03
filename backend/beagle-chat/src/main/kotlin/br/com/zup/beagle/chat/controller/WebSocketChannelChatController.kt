package br.com.zup.beagle.chat.controller

import br.com.zup.beagle.chat.consumer.WebSocketEventListener
import br.com.zup.beagle.chat.model.WebSocketChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.web.bind.annotation.RestController
import java.lang.String.format


@RestController
class WebSocketChannelChatController (
        private val messagingTemplate: SimpMessagingTemplate
){

    companion object {
        private val logger: Logger =  LoggerFactory.getLogger(WebSocketEventListener::class.java)
    }

    val topicPath = "/topic/%s"

    @MessageMapping("/chat/{channelName}/send-message")
    fun sendMessage(@DestinationVariable channelName: String, @Payload chatMessage: WebSocketChatMessage) {
        logger.info("\nChannel: " + channelName + "\nMessage Recived: "+ chatMessage.content + "\nFrom: "+ chatMessage.sender)
        messagingTemplate.convertAndSend(format(topicPath,channelName),chatMessage)

    }

    @MessageMapping("/chat/{channelName}/add-user")
    fun addUser(@DestinationVariable channelName: String, @Payload chatMessage: WebSocketChatMessage,
                headerAccessor: SimpMessageHeaderAccessor) {
        val currentChannel = headerAccessor.sessionAttributes?.put("channel_name", channelName) as String?
        if (currentChannel != null) {
            val leaveMessage = WebSocketChatMessage()
            leaveMessage.type = "Leave"
            leaveMessage.sender
            messagingTemplate.convertAndSend(format(topicPath, currentChannel), leaveMessage)
        }
        headerAccessor.sessionAttributes?.put("name",chatMessage.sender)
        messagingTemplate.convertAndSend(format(topicPath,channelName), chatMessage)
    }
}
