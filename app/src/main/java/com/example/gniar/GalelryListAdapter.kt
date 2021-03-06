package com.example.gniar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.item_daily.view.*
// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

data class Img(val title : String, val urlStr : String)

class GalelryListAdapter(private val img : List<Img>) : RecyclerView.Adapter<GalelryHolder>() {
    override fun getItemCount(): Int {
        return img.size
    }

    override fun onBindViewHolder(holder: GalelryHolder, position: Int) {
        holder.bindDaily(img[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalelryHolder {
        return GalelryHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_gallery, parent, false))
    }
}

class GalelryHolder(view : View) : RecyclerView.ViewHolder(view) {
    private val img = view.img
    fun bindDaily(i: Img) {

        img.setImageResource(i.urlStr.toInt())
    }
}
