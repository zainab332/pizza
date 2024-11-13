package com.example.my_pizza

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.my_pizza.ADAPTERS.AdapterPizza
import com.example.my_pizza.DATA.pizza

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val pizzas = listOf(
            pizza(
                "Margherita",
                2,
                10,
                "Pizza classique avec sauce tomate, mozzarella, et basilic.",
                "_Tomate,\n_mozzarella,\n_basilic",
                R.drawable.pizza5
            ),
            pizza(
                "Hawaïenne",
                4,
                15,
                "Pizza avec sauce tomate, jambon et ananas.",
                "_Tomate,\n_jambon,\n_ananas,\n_mozzarella",
                R.drawable.pizza2
            ),
            pizza(
                "Végétarienne",
                6,
                15,
                "Pizza avec une variété de légumes frais et de la mozzarella.",
                "_Tomate,\n_courgettes,\n_poivrons,\n_oignons,\n_champignons,\nmozzarella",
                R.drawable.legume
            ),
            pizza(
                "Pepperoni",
                3,
                12,
                "Pizza avec sauce tomate, mozzarella et pepperoni épicé.",
                "Tomate, \n" +
                        "_mozzarella, \n" +
                        "_pepperoni",
                R.drawable.pizza1
            ),
            pizza(
                "Pizza Chat",
                8,
                15,
                "Pizza en forme de tête de chat , et décorations créatives pour les enfants.",
                "Tomate, mozzarella, \n_pepperoni, \n_champignons, courgettes, \n_poivron rouge, \n_poivron jaune, \n_ciboulette", R.drawable.chat
            ),
            pizza(
                "Pizza Cœur",
                4,
                14,
                "Pizza en forme de cœur avec sauce tomate, mozzarella, et pepperonis découpés en forme de cœur.",
                "Tomate, \n_mozzarella, \n_pepperoni en forme de cœur, \n_herbes",
                R.drawable.pizza8
            ),
            pizza(
                "Pizza au Chocolat ",
                4,
                30,
                "C'est le dessert idea; pour toute la famile !",
                "_Nutelle faite maison,\n_Garni de bananes,\n_Noix de coco,\n_Noisittes hachees",
                R.drawable.pizza9
            ),
            pizza(
                "Pizza fruit De mer ",
                7,
                30,
                "Riche en protéines maigres et en minéraux tels que l’iode et le zinc, les fruits de mer sont excellents pour la santé !. ",
                "_beurre,\n_Gousse d'ail hache,\n_Petoncles ,decongeles ,egouttes,\n_Crevettes egouttees ,\n_moules, \n_Poivre:selon votre gout",
                R.drawable.pizza10
            )
        )


        var list = findViewById<ListView>(R.id.lv)
        list.adapter=AdapterPizza(this, pizzas )
    }

    @SuppressLint("ResourceType")
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
