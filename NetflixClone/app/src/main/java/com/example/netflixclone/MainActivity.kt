package com.example.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.Adapter.FilmlerAdapter
import com.example.entity.Filmler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyPop.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val filmlerlistesi=ArrayList<Filmler>()
        val f1=Filmler("witcher")
        val f2=Filmler("narcos")
        val f3=Filmler("blackaf")
        val f4=Filmler("after")
        filmlerlistesi.add(f1)
        filmlerlistesi.add(f2)
        filmlerlistesi.add(f3)
        filmlerlistesi.add(f4)
        val adapter= FilmlerAdapter(this,filmlerlistesi)
        recyPop.adapter=adapter
        //*********************
        recyGündem.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val filmlerlistesi2=ArrayList<Filmler>()
        val ff1=Filmler("darkk")
        val ff2=Filmler("kaplan")
        val ff3=Filmler("ozark")
        val ff4=Filmler("stra")
        filmlerlistesi2.add(ff1)
        filmlerlistesi2.add(ff2)
        filmlerlistesi2.add(ff3)
        filmlerlistesi2.add(ff4)
        val adapter2= FilmlerAdapter(this,filmlerlistesi2)
        recyGündem.adapter=adapter2
        //*********************


        recYeniden.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val filmlerlistesi3=ArrayList<Filmler>()
        val fff1=Filmler("red")
        val fff2=Filmler("silence")
        val fff3=Filmler("under")
        val fff4=Filmler("gorun")
        filmlerlistesi3.add(fff1)
        filmlerlistesi3.add(fff2)
        filmlerlistesi3.add(fff3)
        filmlerlistesi3.add(fff4)
        val adapter3= FilmlerAdapter(this,filmlerlistesi3)
        recYeniden.adapter=adapter3
    }
}