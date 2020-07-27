package br.com.zup.beagle.chat.bff.components.widgets

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
class CustomTextInput(
        val styleId:String = "",
        val placeholder:String = "",
        val textColor: String = "") : Widget()
