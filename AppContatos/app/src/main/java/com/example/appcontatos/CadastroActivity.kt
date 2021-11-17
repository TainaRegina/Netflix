package com.example.appcontatos

import android.app.DatePickerDialog
import android.app.ProgressDialog.show
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.*


private val DatePickerDialog.maxDate: Unit
    get() {
        TODO("Not yet implemented")
    }

class CadastroActivity : AppCompatActivity() {

    //    private lateinit var binding: CadastroActivity
    private lateinit var dataCompra: TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


        dataCompra = findViewById(R.id.dataCompra)

        val calendario = Calendar.getInstance()

//        val picker = DatePickerDialog.OnDateSetListener { view, ano, mes, dia ->
//            calendario.set(Calendar.YEAR, ano)
//            calendario.set(Calendar.MONDAY, mes)
//            calendario.set(Calendar.DAY_OF_MONTH, dia)
//            calendario.add(Calendar.DATE, -7)
//            calendario.add(Calendar.DATE, 10)
//            upDate(calendario)
//
//        }
//
//        dataCompra.setOnClickListener {
//
//            DatePickerDialog(
//                this,
//                picker,
//                calendario.get(Calendar.YEAR),
//                calendario.get(Calendar.MONTH),
//                calendario.get(Calendar.DAY_OF_MONTH)
//
//            ).show()
//
//
//        }
//    }

//        fun upDate(calendario: Calendar) {
//            val formato = "dd-mm-yyyy"
//            val sdf = SimpleDateFormat(formato, Locale.US)
//            dataCompra.setText(sdf.format(calendario.time))
//        }
//    }
//setText(sdf.format.(calendario.time))

///////////////////////////////////


        dataCompra.setOnClickListener {

            val todayDate: Calendar = Calendar.getInstance()
            val ano: Int = todayDate.get(Calendar.YEAR)
            val mes: Int = todayDate.get(Calendar.MONTH)
            val dia: Int = todayDate.get(Calendar.DAY_OF_MONTH)


            val dateDialog = DatePickerDialog(this, this, ano, mes, dia)

            todayDate.add(Calendar.DATE, -7)
            dateDialog.datePicker.minDate = todayDate.timeInMillis

            todayDate.add(Calendar.DATE, 10)
            dateDialog.datePicker.maxDate = todayDate.timeInMillis

            dateDialog.datePicker.maxDate = Date().time


            dateDialog.show()


        }
    }

    private fun DatePickerDialog(
        cadastroActivity: CadastroActivity,
        cadastroActivity1: CadastroActivity,
        ano: Int,
        mes: Int,
        dia: Int
    ): DatePickerDialog {
        TODO("Not yet implemented")
    }
}




//
//    }
//        dataCompra.setOnClickListener {
//            val calendario = Calendar.getInstance()
//
//            val datePicker = DatePickerDialog.OnDateSetListener { view, ano, mes, dia ->
//
//                calendario.set(Calendar.YEAR, ano)
//                calendario.set(Calendar.MONDAY, mes)
//                calendario.set(Calendar.DAY_OF_MONTH, dia)
//                calendario.add(Calendar.DATE, -7)
//                calendario.add(Calendar.DATE, 10)
//
//
//
//
//
//                dateDialog.datePicker.minDate = todayDate.timeInMillis
//
//                todayDate.add(Calendar.DATE, 10)
//                dateDialog.datePicker.maxDate = todayDate.timeInMillis
//
//                dateDialog.show()
//
//
//
//
//                private fun DatePickerDialog(
//                    cadastroActivity: CadastroActivity,
//                    ano: Int,
//                    mes: Int,
//                    dia: Int
//                ): DatePickerDialog {
//
//                }



