package com.example.caraoucoroa3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_resultado2.*
import java.util.*
import kotlin.random.Random

class Resultado2Activity : AppCompatActivity() {

    private lateinit var BtnPlay : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado2)


    }

    fun sortearMoeda(view: View) {
        image1.visibility= View.VISIBLE
        image2.visibility= View.VISIBLE
        image3.visibility= View.VISIBLE
        val sort1 = rand()
        val sort2 = rand()
        val sort3 = rand()
        if (sort1 == 0) {
            image1.setImageResource(R.drawable.heads)
            textView1.text="Cara"
        }
        else{
            image1.setImageResource(R.drawable.tails)
            textView1.text="Coroa"
        }
        if (sort2 == 0) {
            image2.setImageResource(R.drawable.heads)
            textView2.text="Cara"
        }
        else{
            image2.setImageResource(R.drawable.tails)
            textView2.text="Coroa"
        }
        if (sort3 == 0) {
            image3.setImageResource(R.drawable.heads)
            textView3.text="Cara"
        }
        else{
            image3.setImageResource(R.drawable.tails)
            textView3.text="Coroa"
        }

    }
    fun rand(): Int {
        val numero = Random.nextInt(2)
        return numero
    }

}
