package com.example.my_pizza

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityLogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_layout_1)  // Le layout pour votre Splash Screen

        // Handler pour exécuter un délai de 3 secondes
        Handler().postDelayed({
            // Après 3 secondes, lancez l'activité principale (MainActivity ou autre)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Fermer la SplashActivity afin que l'utilisateur ne puisse pas revenir à l'écran de splash
            finish()
        }, 3000)
    }
}
