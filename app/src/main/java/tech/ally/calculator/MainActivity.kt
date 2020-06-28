package tech.ally.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //    lateinit var results:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        results= findViewById(R.id.textView)
    }


    fun button7Clicked() {
        appendOnExpression("7", true)
    }

    fun button8Clicked() {
        appendOnExpression("8", true)
    }

    fun button9Clicked() {
        appendOnExpression("9", true)
    }

    fun button0Clicked() {
        appendOnExpression("0", true)
    }

    fun button4Clicked() {
        appendOnExpression("4", true)
    }

    fun button3Clicked() {
        appendOnExpression("3", true)
    }

    fun button2Clicked() {
        appendOnExpression("2", true)
    }

    fun button1Clicked() {
        appendOnExpression("1", true)
    }

    fun button6Clicked() {
        appendOnExpression("6", true)
    }

    fun button5Clicked() {
        appendOnExpression("5", true)
    }


    fun buttonDivideClicked() {
        appendOnExpression("/", false)
    }

    fun buttonMultiplyClicked() {
        appendOnExpression("*", false)
    }

    fun buttonAddClicked() {
        appendOnExpression("+", false)
    }

    fun buttonCancelClicked() {
        textView.text = ""
        textView3.text = ""
    }

    fun buttonDotClicked() {
        appendOnExpression(".", false)
    }

    fun buttonSubtractClicked() {
        appendOnExpression("-", false)
    }

    fun buttonEqualsClicked() {

    }

    private fun appendOnExpression(value: String, canClear: Boolean) {
        if (textView3.text.isNotEmpty())
            textView.text = ""

        if (canClear) {
            textView3.text = ""
            textView.append(value)
        } else {
            textView.append(textView3.text)
            textView.append(value)
            textView3.text = ""
        }

    }
}