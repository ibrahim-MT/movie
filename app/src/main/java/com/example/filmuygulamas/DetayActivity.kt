package com.example.filmuygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detay.*
import kotlinx.android.synthetic.main.film_card_tasarim.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val film =intent.getSerializableExtra("filmnesne") as Filmler
        //textViewfilmAd.text=film.film_ad
        textViewYil.text= (film.film_yil).toString()
        textViewYönetmen.text=film.yonetmen.yonetmen_ad

        imageViewResim.setImageResource(resources.getIdentifier(film.film_resim,
        "drawable",packageName))

    }
}