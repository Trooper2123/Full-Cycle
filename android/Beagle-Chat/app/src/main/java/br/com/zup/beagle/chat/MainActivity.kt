package br.com.zup.beagle.chat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ScreenRequest


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = BeagleActivity.newIntent(this, ScreenRequest("/chat"))
        startActivity(intent)
        finish()
    }
}