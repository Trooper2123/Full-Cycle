package br.com.zup.beagle.chat.beagle.components

import android.view.View
import br.com.zup.beagle.android.components.PathType
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.chat.data.Border

@RegisterWidget
class BeagleChatImage(
    val path: PathType.Remote,
    val outerBorder: Border,
    val innerBorder: Border
) : WidgetView() {
    override fun buildView(rootView: RootView): View {
        TODO("Not yet implemented")
    }
}