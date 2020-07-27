package br.com.zup.beagle.chat.bff.components.chat.footer

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
class CustomTextInputComponent(
        val styleId:String = "",
        val placeholder:String = "",
        val textColor: String = "") : Widget()
