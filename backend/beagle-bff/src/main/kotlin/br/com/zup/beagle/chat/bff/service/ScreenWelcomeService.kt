package br.com.zup.beagle.chat.bff.service

import br.com.zup.beagle.chat.bff.builder.ScreenWelcomeBuilder
import org.springframework.stereotype.Service

@Service
class ScreenWelcomeService {
    fun createScreenWelcome() = ScreenWelcomeBuilder()
}