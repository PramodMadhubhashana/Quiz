package com.example.quiz.activity

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.R

class RankScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rank_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val batch3rd: ImageView = findViewById(R.id.imageviewthree);
        val batchone : ImageView = findViewById(R.id.imageviewone);
        val batch2nd : ImageView = findViewById(R.id.imageviewtwo);
        val coin: ImageView = findViewById(R.id.imageViewcoin);
        val crown: ImageView = findViewById(R.id.imageView8);
        batch3rd.setImageResource(R.drawable.batchthree);
        batchone.setImageResource(R.drawable.batchone);
        batch2nd.setImageResource(R.drawable.batchtwo);
        coin.setImageResource(R.drawable.coin);
        crown.setImageResource(R.drawable.crownicon);
    }

}