package com.example.filmuygulamas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_filmler.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.KategoriRV

class FilmlerActivity : AppCompatActivity() {
    private lateinit var filmliste:ArrayList<Filmler>
    private lateinit var adapter:FilmlerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filmler)

        val kategori=intent.getSerializableExtra("kategorinesne")as Kategoriler

        filmlerRV.setHasFixedSize(true)
        filmlerRV.layoutManager= StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        filmliste= ArrayList()
        val k =Kategoriler(1,"Dram")
        val y =Yonetmenler(1,"osmansınav")
        val f1 =Filmler(1,"Django",2008,"django",k,y)
        val f2 =Filmler(2,"thepianist",2009,"thepianist",k,y)
        val f3 =Filmler(3,"inception",2010,"inception",k,y)

        filmliste.add(f1)
        filmliste.add(f2)
        filmliste.add(f3)

        adapter= FilmlerAdapter(this,filmliste)
        filmlerRV.adapter=adapter
    }
}