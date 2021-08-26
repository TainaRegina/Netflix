package com.example.appcontatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val contatoAdapter = ContatoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contatoAdapter

        val contatos = listOf(
            Contato("Contato 1", "99999999", "email"),
            Contato("Contato 2", "99999993", "email"),
            Contato("Contato 3", "99999997", "email"),
            Contato("Contato 4", "99999995", "email"),
            Contato("Contato 5", "99999966", "email")

        )
        contatoAdapter.upDateItems(contatos)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_cadastrar -> {
                val intent = Intent(this, CadastroActivity::class.java )
                startActivity(intent)
                true
            }
            else -> {
                false
            }
    }

        return super.onOptionsItemSelected(item)
    }
}