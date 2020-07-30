package br.com.zup.beagle.chat.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.chat.bff.data.WebSocketConfig
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ChatComponent(
        val children: List<ServerDrivenComponent>,
        val webSocketConfig: WebSocketConfig,
        val backGroundColor: String
) : Widget()
