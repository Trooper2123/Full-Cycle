package br.com.zup.beagle.chat.bff.controller



import br.com.zup.beagle.chat.bff.service.ScreenWelcomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenWelcomeController
(private val screenWelcomeService: ScreenWelcomeService){

    @GetMapping("/welcome")
    fun getWelcomeScreen () = this.screenWelcomeService.createScreenWelcome()

}