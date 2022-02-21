package com.example.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.PopupMenu
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView
import com.example.entity.Filmler
import com.example.netflixclone.R
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class FilmlerAdapter (var mContext:Context,var filmlerlist:List<Filmler>) :RecyclerView.Adapter<FilmlerAdapter.cardTasarımTutucu>() {
    inner class cardTasarımTutucu(view:View):RecyclerView.ViewHolder(view){

        var imageView:ImageView

        init {

            imageView=view.findViewById(R.id.filmresim)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarımTutucu {
        val tasarım=LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return cardTasarımTutucu(tasarım)

    }

    override fun onBindViewHolder(holder: cardTasarımTutucu, position: Int) {
      val film=filmlerlist.get(position)
        holder.imageView.setImageResource(mContext.resources.getIdentifier(film.filmResimad,"drawable",mContext.packageName))



    }

    override fun getItemCount(): Int {
       return filmlerlist.size
    }

}