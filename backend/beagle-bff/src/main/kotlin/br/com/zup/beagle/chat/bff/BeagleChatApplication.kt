package br.com.zup.beagle.chat.bff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeagleChatApplication

fun main(args: Array<String>) {
    runApplication<BeagleChatApplication>(*args)
}
