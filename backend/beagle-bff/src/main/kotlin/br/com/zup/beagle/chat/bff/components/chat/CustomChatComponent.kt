package br.com.zup.beagle.chat.bff.components.chat

import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.chat.bff.data.WebSocketConfig
import br.com.zup.beagle.chat.bff.widget.ChatComponent
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.layout.ComposeComponent
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

class CustomChatComponent(
        private val backgroundColor: String = "#ffffff",
        private val webSocketConfig: WebSocketConfig
) : ComposeComponent {
    override fun build(): ServerDrivenComponent = ChatComponent(
            backGroundColor = backgroundColor,
            children = listOf(
                    //,
                    CustomContentComponent(
                            path = ImagePath.Remote(remoteUrl = ""),
                            outerBorder = Border(color = "", width = ""),
                            innerBorder = Border(color = "", width = ""),
                            children = listOf(
                                    Text("MENSAGEM AQUI")
                            ),
                            border = Border(color = "", width = ""),
                            cornerRadius = 10,
                            backgroundColor = "",
                            flexDirection = FlexDirection.ROW
                    ),
                    CustomSenderComponent(
                            backgroundColor = "#ffffff",
                            border = Border(color = "#FFFFFF", width = "0"),
                            cornerRadius = 0,
                            children = listOf(
                                    TextInput(
                                            placeholder = "Digite sua mensagem ..."
                                    ),
                                    Button(
                                            text = "Enviar"
                                    )
                            ),
                            flexDirection = FlexDirection.ROW
                    )
            ),
            webSocketConfig = webSocketConfig
    )
}