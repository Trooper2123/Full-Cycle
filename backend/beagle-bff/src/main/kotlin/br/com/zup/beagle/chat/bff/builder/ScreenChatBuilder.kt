package br.com.zup.beagle.chat.bff.builder

import br.com.zup.beagle.annotation.BeaglePreview
import br.com.zup.beagle.chat.bff.components.chat.CustomChatComponent
import br.com.zup.beagle.chat.bff.data.WebSocketConfig
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder


class ScreenChatBuilder : ScreenBuilder {

    @BeaglePreview
    override fun build() = Screen(
            navigationBar = NavigationBar(
                    title = "BeagleChat"
            ),
            child = Container(
                    children = listOf(
                            //TODO: header render goes here
                            CustomChatComponent(
                                    backgroundColor = "#F0F0F0",
                                    //TODO: fix websocket URL
                                    webSocketConfig = WebSocketConfig(url = "ws.localhost:8080")
                            )
                    )
            )
    )
}

