package br.com.zup.beagle.chat.bff.components.chat

import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.chat.bff.widget.BeagleChatContainer
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.widget.layout.ComposeComponent

class CustomChatToolbar: ComposeComponent {
    override fun build(): ServerDrivenComponent = BeagleChatContainer(
            children = listOf(),
            border = Border(
                    color = "",
                    width = ""
            ),
            backGroundColor = "",
            cornerRadius = 0
    )
}