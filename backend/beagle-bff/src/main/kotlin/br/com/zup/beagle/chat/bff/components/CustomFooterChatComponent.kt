package br.com.zup.beagle.chat.bff.components

import br.com.zup.beagle.chat.bff.components.widgets.CustomTextInput
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.core.JustifyContent
import br.com.zup.beagle.widget.layout.Container

class CustomFooterChatComponent {

    fun customFooterChatComponent(
    ): Container {
        return Container(
                children = listOf(
                        CustomTextInput(
                                styleId = "CustomInputMessageText",
                                placeholder = "TESTANDO",
                                textColor = "#F8F6F4"
                        )
                )
        ).applyFlex(
                Flex(
                        flexDirection = FlexDirection.ROW,
                        justifyContent = JustifyContent.CENTER
                )
        )
    }
}