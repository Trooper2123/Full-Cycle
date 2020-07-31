package br.com.zup.beagle.chat.bff.service

import br.com.zup.beagle.chat.bff.builder.ScreenChatBuilder
import org.springframework.stereotype.Service

@Service
class ScreenChatService {
    fun createScreenChat() = ScreenChatBuilder()
}