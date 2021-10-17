package com.example.recyclerview_meiwildanmuhammadfarrel_21

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_meiwildanmuhammadfarrel_21.R

class fotoAdapter (private val context: Context, private val Foto: List<Foto>, val listener: (Foto) -> Unit)
    : RecyclerView.Adapter<fotoAdapter.fotoViewHolder>() {

    class fotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgfoto = view.findViewById<ImageView>(R.id.img_item_photo)
        val namefoto = view.findViewById<TextView>(R.id.tv_item_name)
        val descfoto = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(Foto: Foto, listener: (Foto) -> Unit) {
            imgfoto.setImageResource(Foto.imgfoto)
            namefoto.text = (Foto.namefoto)
            descfoto.text = (Foto.descfoto)
            itemView.setOnClickListener{
                (listener(Foto))
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): fotoViewHolder {
        return fotoViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_foto, parent, false)
        )
    }
    override fun onBindViewHolder(holder: fotoViewHolder, position: Int) {
        holder.bindView(Foto[position], listener)
    }
    override fun getItemCount(): Int = Foto.size
}