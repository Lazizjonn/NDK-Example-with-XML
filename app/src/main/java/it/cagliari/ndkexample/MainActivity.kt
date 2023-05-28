package it.cagliari.ndkexample

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import it.cagliari.ndkexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val utils = Utils()
    private var message: String = ""

    private lateinit var binding: ActivityMainBinding


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TTT", utils.key)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            message = utils.neverShareKey()
            binding.sampleText.text = message
            Log.d("TTT", utils.key)
        }

        message = utils.getInfo()

        binding.sampleText.text = message
    }

}