package app.doggy.checkworkcount_minusreset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkcount_minusreset.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
    }
}