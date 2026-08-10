package com.quangminh.productdetailsrinformation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Paint
import android.widget.TextView
import android.text.SpannableString
import android.text.style.StrikethroughSpan



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.before_discount_price)
        val textContent = getString(R.string._10_76)
        val spannable = android.text.SpannableString(textContent)
        spannable.setSpan(android.text.style.StrikethroughSpan(), 0, textContent.length, 0)
        textView.text = spannable


    }



}
