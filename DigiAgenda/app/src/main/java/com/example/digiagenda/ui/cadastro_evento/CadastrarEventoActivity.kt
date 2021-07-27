package com.example.digiagenda.ui.cadastro_evento

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.TimePickerDialog
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.digiagenda.R
import com.example.digiagenda.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_cadastrar_evento.*
import java.text.SimpleDateFormat
import java.util.*


class CadastrarEventoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_evento)

        supportActionBar?.setDisplayShowCustomEnabled(true)

        val colorDrawable = ColorDrawable(getColor(R.color.topBar_color))
        supportActionBar?.setBackgroundDrawable(colorDrawable)

        salvar_evento.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        tv_icon_calendar.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, mYear, mMonth, mDay ->
              tv_valor_data.setText("" + mDay + "/" + (mMonth.toInt()+1).toString() + "/" + mYear)
            }, year, month, day)

            dpd.show()
        }
        
        tv_valor_hora.setOnClickListener {
            val cal = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)

                tv_valor_hora.setText(SimpleDateFormat("HH:mm").format(cal.time))
            }

            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()
        }

        val lista = listOf("Minutos","Horas")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lista)
        spinner.adapter = adaptador
    }
}