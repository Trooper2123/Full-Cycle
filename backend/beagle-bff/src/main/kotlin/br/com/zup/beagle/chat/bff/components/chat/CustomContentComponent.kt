package br.com.zup.beagle.chat.bff.components.chat

import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.chat.bff.widget.BeagleChatContainer
import br.com.zup.beagle.chat.bff.widget.BeagleChatImage
import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.layout.ComposeComponent
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.ImagePath

class CustomContentComponent(
        private val path: ImagePath.Remote,
        private val innerBorder: Border,
        private val outerBorder: Border,
        private val backgroundColor: String,
        private val border: Border,
        private val cornerRadius: Int,
        private val children: List<ServerDrivenComponent>,
        private val flexDirection: FlexDirection
) : ComposeComponent {
    override fun build(): ServerDrivenComponent = Container(
            children = listOf(
                    BeagleChatImage(
                            path = path,
                            outerBorder = outerBorder,
                            innerBorder = innerBorder
                    ),
                    BeagleChatContainer(
                            children = children,
                            border = border,
                            cornerRadius = cornerRadius,
                            backGroundColor = backgroundColor
                    )
            )
    ).applyStyle(
            Style(
                    flex = Flex(
                            flexDirection
                    )
            )
    )

}