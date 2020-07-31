package br.com.zup.beagle.chat.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class BeagleChatContainer(
        val children: List<ServerDrivenComponent>,
        val border: Border,
        val cornerRadius: Int,
        val backGroundColor: String
) : Widget()

