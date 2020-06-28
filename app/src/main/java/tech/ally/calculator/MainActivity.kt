package tech.ally.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    //    lateinit var results:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        results= findViewById(R.id.textView)
    }


    fun button7Clicked(view: View) {
        appendOnExpression("7", true)
    }

    fun button8Clicked(view: View) {
        appendOnExpression("8", true)
    }

    fun button9Clicked(view: View) {
        appendOnExpression("9", true)
    }

    fun button0Clicked(view: View) {
        appendOnExpression("0", true)
    }

    fun button4Clicked(view: View) {
        appendOnExpression("4", true)
    }

    fun button3Clicked(view: View) {
        appendOnExpression("3", true)
    }

    fun button2Clicked(view: View) {
        appendOnExpression("2", true)
    }

    fun button1Clicked(view: View) {
        appendOnExpression("1", true)
    }

    fun button6Clicked(view: View) {
        appendOnExpression("6", true)
    }

    fun button5Clicked(view: View) {
        appendOnExpression("5", true)
    }


    fun buttonDivideClicked(view: View) {
        appendOnExpression("/", false)
    }

    fun buttonMultiplyClicked(view: View) {
        appendOnExpression("*", false)
    }

    fun buttonAddClicked(view: View) {
        appendOnExpression("+", false)
    }

    fun buttonCancelClicked(view: View) {
        textView.text = ""
        textView3.text = ""
    }

    fun buttonDotClicked(view: View) {
        appendOnExpression(".", false)
    }

    fun buttonSubtractClicked(view: View) {
        appendOnExpression("-", false)
    }

    fun buttonEqualsClicked(view: View) {
        try {
            val exp = ExpressionBuilder(textView.text.toString()).build()
            val results = exp.evaluate()
            val longResults = results.toLong()
            if(results == longResults.toDouble())
                textView3.text = longResults.toString()
            else
                textView3.text = results.toString()

        } catch (e: Exception) {
            Toast.makeText(applicationContext,"Exception occurred",Toast.LENGTH_SHORT)
            Log.d("Exception", "message: " + e.message)
        }
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