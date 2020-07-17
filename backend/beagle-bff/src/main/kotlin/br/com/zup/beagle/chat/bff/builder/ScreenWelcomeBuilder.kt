package br.com.zup.beagle.chat.bff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text


object ScreenWelcomeBuilder : ScreenBuilder {
    override fun build() = Screen(
            navigationBar = NavigationBar(
                    title = "BeagleChat"
            ),
            child = Container(
                    children = listOf(
                            beagleText(text = "BeagleChat"),
                            beagleText(text = "O chat feito por zuppers para zuppers!"),
                            beagleText(text = ":D")
                    )

            )
    )

    private fun beagleText(
            text: String,
            styleId: String? = null,
            appearanceColor: String? = null
    ) = Text(text = text, styleId = styleId)
            .applyStyle(
                    style = Style(
                            margin = EdgeValue(
                                    top = 16.unitReal(),
                                    left = 16.unitReal(),
                                    right = 16.unitReal()
                            ),
                            backgroundColor = appearanceColor
                    )
            )
}
