package com.example.calculator_03

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator_03.databinding.ActivityMainBinding
import com.ezylang.evalex.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val resultTextView = findViewById<TextView>(R.id.result_textView)

        val numberStringBuilder = StringBuilder()

        binding.zeroButton.setOnClickListener {
            numberStringBuilder.append(0)
            resultTextView.text = numberStringBuilder
        }
        binding.oneButton.setOnClickListener {
            numberStringBuilder.append(1)
            resultTextView.text = numberStringBuilder
        }
        binding.twoButton.setOnClickListener {
            numberStringBuilder.append(2)
            resultTextView.text = numberStringBuilder
        }
        binding.threeButton.setOnClickListener {
            numberStringBuilder.append(3)
            resultTextView.text = numberStringBuilder
        }
        binding.fourButton.setOnClickListener {
            numberStringBuilder.append(4)
            resultTextView.text = numberStringBuilder
        }
        binding.fiveButton.setOnClickListener {
            numberStringBuilder.append(5)
            resultTextView.text = numberStringBuilder
        }
        binding.sixButton.setOnClickListener {
            numberStringBuilder.append(6)
            resultTextView.text = numberStringBuilder
        }
        binding.sevenButton.setOnClickListener {
            numberStringBuilder.append(7)
            resultTextView.text = numberStringBuilder
        }
        binding.eightButton.setOnClickListener {
            numberStringBuilder.append(8)
            resultTextView.text = numberStringBuilder
        }
        binding.nineButton.setOnClickListener {
            numberStringBuilder.append(9)
            resultTextView.text = numberStringBuilder
        }
        binding.plusButton.setOnClickListener {
            numberStringBuilder.append("+")
            resultTextView.text = numberStringBuilder
        }
        binding.minusButton.setOnClickListener {
            numberStringBuilder.append("-")
            resultTextView.text = numberStringBuilder
        }
        binding.multiplyButton.setOnClickListener {
            numberStringBuilder.append("*")
            resultTextView.text = numberStringBuilder
        }
        binding.divideButton.setOnClickListener {
            numberStringBuilder.append("/")
            resultTextView.text = numberStringBuilder
        }
        binding.clearButton.setOnClickListener {
            resultTextView.text = "0"
            numberStringBuilder.clear()
        }
        binding.pointButton.setOnClickListener {
            numberStringBuilder.append(".")
            resultTextView.text = numberStringBuilder
        }
        binding.equalButton.setOnClickListener {
            numberStringBuilder.append("=")
            resultTextView.text = numberStringBuilder
        }
        binding.resetButton.setOnClickListener {
            val lastIndex = numberStringBuilder.length - 1
            numberStringBuilder.deleteCharAt(lastIndex)
            resultTextView.text = numberStringBuilder
        }

        binding.equalButton.setOnClickListener {

            try {
                val stringExpression = numberStringBuilder.toString()
                val expression = Expression(stringExpression)
                val expressionResult = expression.evaluate().numberValue
                resultTextView.text = expressionResult.toString()

                numberStringBuilder.clear()
                numberStringBuilder.append(expressionResult.toString())
            } catch (t: Throwable) {
                Toast.makeText(this@MainActivity, "Exception: $t", Toast.LENGTH_LONG)
                    .show()

            }

        }


    }
}
