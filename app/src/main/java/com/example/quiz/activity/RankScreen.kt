package com.example.quiz.activity

import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.R
import com.example.quiz.adapter.LeaderAdapter
import com.example.quiz.databinding.ActivityRankScreenBinding
import com.example.quiz.domain.useModel

class RankScreen : AppCompatActivity() {
    lateinit var binding: ActivityRankScreenBinding
    private val leaderAdapter by lazy {LeaderAdapter()}
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

        val window: Window = this@RankScreen.window
        Window.statusBarColor = ContextCompat.getColor(this@RankScreen, R.color.white)
        binding.apply {
            binding.textViewthirdname.text= loaddata().get(0).score.toString()
        }


    }
    private fun loaddata():MutableList<useModel>{
        val users : MutableList<useModel> = mutableListOf()
        users.add(useModel(1,"Sopia", "persional1", 4888))
        users.add(useModel(1,"Sopia", "persional1", 4888))
        users.add(useModel(1,"Sopia", "persional1", 4888))
        users.add(useModel(1,"Sopia", "persional1", 4888))
        users.add(useModel(1,"Sopia", "persional1", 4888))
        users.add(useModel(1,"Sopia", "persional1", 4888))
        return users

    }

}