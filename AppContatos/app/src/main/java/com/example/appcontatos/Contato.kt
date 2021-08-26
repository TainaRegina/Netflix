package com.example.appcontatos

data class Contato (
    val nome: String,
    val telefone: String,
    val email: String,
    val id: Int? = null
        )

fun teste() {

    val c = Contato("nome", "telefone", "email")
    val c2 = c.copy("nome2")


}

