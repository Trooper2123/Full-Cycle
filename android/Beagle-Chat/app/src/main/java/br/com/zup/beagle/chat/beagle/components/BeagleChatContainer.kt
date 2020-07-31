package br.com.zup.beagle.chat.beagle.components

import android.view.View
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.chat.data.Border
import br.com.zup.beagle.core.ServerDrivenComponent

@RegisterWidget
class BeagleChatContainer(
    val children: List<ServerDrivenComponent>,
    val border: Border,
    val cornerRadius: Int,
    val backGroundColor: String
) : WidgetView() {
    override fun buildView(rootView: RootView): View {
        TODO("Not yet implemented")
    }
}