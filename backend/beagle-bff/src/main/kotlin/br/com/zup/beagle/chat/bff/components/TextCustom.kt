package br.com.zup.beagle.chat.bff.components

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget


@RegisterWidget
class TextCustom(val message:String, val styleId:String) : Widget()