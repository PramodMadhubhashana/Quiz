package com.example.quiz.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.R
import com.example.quiz.databinding.ActivityQuestionBinding

class ScoreActivity : AppCompatActivity() {
    var score:Int=0
    lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        score=intent.getIntExtra("Score",0)

        binding.apply {
            scoreTxt.text=score.toString()
            backbtn.setOnClickListener{
                startActivity(intent(this@ScoreActivity,MainActivity::class.java))
                finish()
            }
        }

    }
}