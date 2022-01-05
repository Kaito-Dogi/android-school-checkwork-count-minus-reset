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

        // 整数を管理する変数
        var count: Int = 0

        // plus_buttonをクリックした時の処理
        binding.plusButton.setOnClickListener {
            // countの値を1増やす
            count += 1

            // countの値をcount_textに表示する
            binding.countText.text = count.toString()
        }

        // minus_buttonをクリックした時の処理
        binding.minusButton.setOnClickListener {
            // countの値を1減らす
            count -= 1
            // もちろん以下のような書き方もOK！
            // count = count - 1
            // count--

            // countの値をcount_textに表示する
            binding.countText.text = count.toString()
        }

        // reset_buttonをクリックした時の処理
        binding.resetButton.setOnClickListener {
            // countに0を代入する
            count = 0

            // countの値をcount_textに表示する
            binding.countText.text = "0"
        }
    }
}