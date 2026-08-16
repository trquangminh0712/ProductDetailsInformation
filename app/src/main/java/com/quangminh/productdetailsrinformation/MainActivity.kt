package com.quangminh.productdetailsrinformation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Paint
import android.widget.TextView
import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import com.quangminh.productdetailsrinformation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: ProductDetailsViewModel by viewModels()
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.currentProductDetails.observe(this) { currentProductDetails ->
            binding.brand.text = currentProductDetails.brand
            binding.productName.text = currentProductDetails.title
            binding.priceAfterDiscount.text = currentProductDetails.price.toString()
            binding.beforeDiscountPrice.text = currentProductDetails.priceAfterDiscount.toString()
            binding.productDescription.text = currentProductDetails.description
            binding.availabilityStatus.text = currentProductDetails.stock.toString()
            binding.sku.text = currentProductDetails.sku
            binding.twogram.text = currentProductDetails.weight.toString() + "g"
            binding.deliverText.text = currentProductDetails.shippingInformation
            binding.warrantyDetails.text = currentProductDetails.warrantyInformation
            binding.returnAndExchangeDetails.text = currentProductDetails.returnPolicy
            binding.Name1.text = currentProductDetails.reviews[0].reviewerName
            binding.comment1.text = currentProductDetails.reviews[0].comment
            binding.Name2.text = currentProductDetails.reviews[1].reviewerName
            binding.comment2.text = currentProductDetails.reviews[1].comment
            binding.Name3.text = currentProductDetails.reviews[2].reviewerName
            binding.comment3.text = currentProductDetails.reviews[2].comment


            viewModel.errorMessage.observe(this){errorMessage ->
                Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
            }


            Log.i("LIFECYCLE","onCreate called")

        }
        val textView = findViewById<TextView>(R.id.before_discount_price)
        val textContent = getString(R.string._10_76)
        val spannable = android.text.SpannableString(textContent)
        spannable.setSpan(android.text.style.StrikethroughSpan(), 0, textContent.length, 0)
        textView.text = spannable







    }

    override fun onStart() {
        super.onStart()
        Log.i("LIFECYCLE","onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFECYCLE","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFECYCLE","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFECYCLE","onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFECYCLE","onDestroy called")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LIFECYCLE","onRestart called")
    }

}
