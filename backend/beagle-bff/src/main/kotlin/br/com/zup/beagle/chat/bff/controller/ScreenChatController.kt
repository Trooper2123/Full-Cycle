package br.com.zup.beagle.chat.bff.controller



import br.com.zup.beagle.chat.bff.service.ScreenChatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenChatController
(private val screenChatService: ScreenChatService){

    @GetMapping("/chat")
    fun getChatScreen () = this.screenChatService.createScreenChat()

}