package com.example.filmuygulamas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class KategoriAdapter(private val mContext:Context,private val kategoriListe:List<Kategoriler>)
    :RecyclerView.Adapter<KategoriAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim:View) :RecyclerView.ViewHolder(tasarim){
        var kategori_card:CardView
        var textViewCategoriAd:TextView

       init {
           kategori_card=tasarim.findViewById(R.id.kategori_card)
           textViewCategoriAd=tasarim.findViewById(R.id.textViewCategoriAd)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim= LayoutInflater.from(mContext).inflate(R.layout.kategori_card_tasarim,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori=kategoriListe.get(position)
        holder.textViewCategoriAd.text=kategori.kategori_ad
        holder.kategori_card.setOnClickListener {
        val intent=Intent(mContext,FilmlerActivity::class.java)
            intent.putExtra("kategorinesne",kategori)
            mContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
    return kategoriListe.size
    }
}