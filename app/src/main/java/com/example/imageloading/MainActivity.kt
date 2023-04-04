package com.example.imageloading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.angry_btn)

        btn.setOnClickListener {
            val url ="https://picsum.photos/300"
            Glide.with(this)
                .load(url)
                .fitCenter()
                .skipMemoryCache(true)

                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image)
        }
    }
}