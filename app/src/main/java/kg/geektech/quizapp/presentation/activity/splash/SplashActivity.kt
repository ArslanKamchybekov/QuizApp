package kg.geektech.quizapp.presentation.activity.splash

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kg.geektech.quizapp.presentation.activity.main.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpMainActivity()

    }

    private fun setUpMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}