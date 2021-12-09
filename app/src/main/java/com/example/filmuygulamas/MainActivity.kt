package com.example.filmuygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var kategoriListe:ArrayList<Kategoriler>
    private lateinit var adapter:KategoriAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    KategoriRV.setHasFixedSize(true)
    KategoriRV.layoutManager=LinearLayoutManager(this)

        kategoriListe= ArrayList()
        val k1=Kategoriler(1,"Komedi")
        val k2=Kategoriler(2,"Dram")
        kategoriListe.add(k1)
        kategoriListe.add(k2)
     adapter=KategoriAdapter(this,kategoriListe)
        KategoriRV.adapter=adapter
    }
}