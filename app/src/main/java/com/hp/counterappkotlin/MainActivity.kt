package com.hp.counterappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

val TAG = "MAINACTIVITY"
val TEXT_CONTENT = "Text content"

class MainActivity : AppCompatActivity() {


    private var textView: TextView? = null
    private var numTimesClicked = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "On create called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userinput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        textView = findViewById(R.id.textView)

        textView?.setText("")
        userinput.setText("")



        button.setOnClickListener {

            //getText
            textView?.append(userinput.text)
            textView?.append("\n")
            userinput.setText("")


        }


    }


    override fun onStart() {
        Log.e(TAG, "Onstart called")

        super.onStart()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e(TAG, "onSaveInstanceState called")
        super.onSaveInstanceState(outState)
        //saving the state in bundle
        outState.putString(TEXT_CONTENT, textView?.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.e(TAG, "onRestoreInstanceState called")

        super.onRestoreInstanceState(savedInstanceState)
        // restoring state

        val savedStrings = savedInstanceState.getString(TEXT_CONTENT, "")
        textView?.text = savedStrings
    }

    override fun onRestart() {
        Log.e(TAG, "onRestart  called")

        super.onRestart()
    }

    override fun onResume() {
        Log.e(TAG, "onResume  called")

        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "onPause  called")

        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop  called")
        //save results

        super.onStop()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy  called")

        super.onDestroy()
    }
}

