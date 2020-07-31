package br.com.zup.beagle.chat.bff.components.chat

import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.chat.bff.widget.BeagleChatContainer
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.layout.ComposeComponent

class CustomSenderComponent(
        private val backgroundColor: String = "#ffffff",
        private val border: Border = Border(color = "#FFFFFF", width = "0"),
        private val cornerRadius: Int = 0,
        private val children: List<ServerDrivenComponent> = listOf(),
        private val flexDirection: FlexDirection = FlexDirection.ROW
) : ComposeComponent {
    override fun build(): ServerDrivenComponent = BeagleChatContainer(
            backGroundColor = backgroundColor,
            border = border,
            cornerRadius = cornerRadius,
            children = children
    ).applyStyle(
            Style(
                    flex = Flex(
                            flexDirection
                    )
            )
    )
}