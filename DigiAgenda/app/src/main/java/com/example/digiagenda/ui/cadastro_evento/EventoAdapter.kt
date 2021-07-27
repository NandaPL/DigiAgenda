package com.example.digiagenda.ui.cadastro_evento

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.digiagenda.R
import kotlinx.android.synthetic.main.item_evento.view.*

class EventoAdapter(
    private val context: Context,
    private val listaServicos: MutableList<String>,
    private val itemClickCallback: ((String) -> Unit)
) : BaseAdapter() {

    companion object {
        data class ViewHolder(val view: View) {
            val txtItemTitulo: TextView = view.item_titulo_evento
            val txtItemData: TextView = view.item_data_evento
        }
    }

    fun swapData(novaListaServicos: List<String>) {
        listaServicos.clear()
        listaServicos.addAll(novaListaServicos)
        notifyDataSetChanged()
    }

    fun filter(s: String){
        var newList: MutableList<String> = mutableListOf()
        for(servico in listaServicos) {
            var descricao = servico
            if (descricao.toLowerCase().contains(s.toLowerCase())) {
                newList.add(servico)
            }
        }
        swapData(newList)
    }

    override fun getCount(): Int = listaServicos.size

    override fun getItem(position: Int): String = listaServicos[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val servico = listaServicos[position]
        val holder: ViewHolder
        val row: View
        if (convertView == null) {
            row = LayoutInflater.from(context).inflate(R.layout.item_evento, parent, false)
            holder = ViewHolder(row)
            row.tag = holder
        } else {
            row = convertView
            holder = convertView.tag as ViewHolder
        }
        holder.txtItemTitulo.text = servico
        holder.txtItemData.text = "27/07/2021"

        holder.txtItemTitulo.setOnClickListener {
            itemClickCallback(servico)
        }
        return row
    }
}