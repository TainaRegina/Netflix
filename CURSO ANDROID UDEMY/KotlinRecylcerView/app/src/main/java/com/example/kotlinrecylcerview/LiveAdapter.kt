package com.example.kotlinrecylcerview

import android.app.DownloadManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecylcerview.models.Live
import kotlinx.android.synthetic.main.res_item_live.view.*

class LiveAdapter(private val onItemClick : (Live) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items : List<Live> = ArrayList()

//cria o layout do xml para o código
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )

    }

// faz a ligação do xml com o recyclerview
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is LiveViewHolder ->{
                holder.bind(items[position], onItemClick)

            }
        }

    }

//conta os items que possui na lista
    override fun getItemCount(): Int {
        return items.size

    }

    //pega os items da lista
    fun setDataSet(lives : List<Live>) {
        this.items = lives
    }



    class LiveViewHolder constructor(
        itemView : View
    ): RecyclerView.ViewHolder(itemView){

        private val liveTitle = itemView.textTitulo
        private val autorLive = itemView.textAutor
        private val banerLive = itemView.imageBaner

        fun bind(live: Live, onItemClick: (Live) -> Unit) {
            liveTitle.text = live.title
            autorLive.text = live.autor


            //PARA CHAMAR A URL DA IMAGEM
//            val requestOptions = RequestOptions
//                .placeholder(R.drawable.rocket)
//                .error(R.drawable.rocket)
//
//            Glide.with(itemView.context)
//                .applyDefaultRequestoptions(requestOptions)
//                .load(live.tumbnailURL)
//                .into(banerLive)


//CHAMANDO O CLICK
            itemView.setOnClickListener{
                onItemClick(live)
            }


        }
    }


}