package br.com.zup.beagle.chat.beagle.components

import android.view.View
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView
import br.com.zup.beagle.chat.data.WebSocketConfig
import br.com.zup.beagle.core.ServerDrivenComponent

class ChatComponent (
    val children: List<ServerDrivenComponent>,
    val webSocketConfig: WebSocketConfig,
    val backGroundColor: String
) : WidgetView() {
    override fun buildView(rootView: RootView): View {
        TODO("Not yet implemented")
    }
}
