package com.example.kotlinrecylcerview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var liveAdapter: LiveAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()

    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.liveAdapter.setDataSet(dataSource)

    }


    private fun initRecyclerView() {
        this.liveAdapter = LiveAdapter{ live ->
        openLink(live.link)

    }
        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = liveAdapter
        }

        //OU PODE FAZER DA FORMA ABAIXO

//        recyclerview.layoutManager = LinearLayoutManager(this)
//        recyclerview.adapter = this.liveAdapter

    }


    //Pega link do canal para abrir no click
    private fun openLink(url : String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}