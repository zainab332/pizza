package com.example.my_pizza

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pizza_layout_3)
        val name=intent.getStringExtra("name")
        val desc=intent.getStringExtra("description")
        val intr=intent.getStringExtra("Ingredients")
        val imageP = intent.getIntExtra("image",R.drawable.legume)

        findViewById<TextView>(R.id.dtnom).text = name
        findViewById<TextView>(R.id.dtdesc).text = desc
        findViewById<TextView>(R.id.dtingr).text = intr
        findViewById<ImageView>(R.id.dtImage).setImageResource(imageP)

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menushare -> {
                // Code for share or any other action
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}