package br.com.zup.beagle.chat.bff.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.chat.bff.data.Border
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.ui.ImagePath

@RegisterWidget
data class BeagleChatImage(
        val path: ImagePath.Remote,
        val outerBorder: Border,
        val innerBorder: Border
) : Widget()