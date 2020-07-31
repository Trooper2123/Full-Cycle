package br.com.zup.beagle.chat.bff.builder

import br.com.zup.beagle.annotation.BeaglePreview
import br.com.zup.beagle.chat.bff.components.chat.footer.CustomFooterChatComponent
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
                            CustomFooterChatComponent().customFooterChatComponent()
                    )
            )
    )
}
