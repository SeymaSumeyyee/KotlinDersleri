package com.example.hesapmakinesi



import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    private var currentInput = ""
    private var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.resultText)

        val numberButtons = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        numberButtons.forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                val digit = (it as Button).text
                currentInput += digit
                resultText.text = currentInput
            }
        }

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                total += currentInput.toInt()
                currentInput = ""
                resultText.text = "+"
            }
        }

        findViewById<Button>(R.id.btnEqual).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                total += currentInput.toInt()
                currentInput = ""
            }
            resultText.text = total.toString()
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            total = 0
            currentInput = ""
            resultText.text = "0"
        }
    }
}
