package com.example.my_pizza.ADAPTERS

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.my_pizza.DATA.pizza
import com.example.my_pizza.MainActivity_2
import com.example.my_pizza.R

class AdapterPizza(private var context: Context, private var pizzas: List<pizza>) : BaseAdapter(){
    override fun getCount(): Int {
        return pizzas.size
    }

    override fun getItem(position: Int): Any {
        return pizzas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = convertView ?: LayoutInflater.from(context).inflate(R.layout.pizza_layout_2,parent ,false)
        val pizza =pizzas[position]

        val name= view.findViewById<TextView>(R.id.textnom)
        val nbingr = view.findViewById<TextView>(R.id.NbLeg)
        val temp=view.findViewById<TextView>(R.id.temps)
        val image = view.findViewById<ImageView>(R.id.img)

        name.text=pizza.nom
        nbingr.text=pizza.nblegume.toString()
        temp.text=pizza.temp.toString()
        image.setImageResource(pizza.image)

        view.setOnClickListener{
            val intent = Intent(context , MainActivity_2::class.java)
            intent.putExtra("name",pizza.nom)
            intent.putExtra("description",pizza.description)
            intent.putExtra("Ingredients",pizza.ingredients)
            intent.putExtra("image",pizza.image)
            context.startActivity(intent)
        }

        return view
    }

}