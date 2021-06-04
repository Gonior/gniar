package com.example.gniar

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_daily.view.*

data class Daily(val title : String, val desc : String, val img : String)

class DailyListAdapter(private val dailies : List<Daily>) : RecyclerView.Adapter<DailyHolder>() {
    override fun getItemCount(): Int {
        return dailies.size
    }

    override fun onBindViewHolder(holder: DailyHolder, position: Int) {
        holder.bindDaily(dailies[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyHolder {
        return DailyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_daily, parent, false))
    }
}

class DailyHolder(view : View) : RecyclerView.ViewHolder(view) {
    private val title = view.title
    private val img = view.img
    private val desc = view.des
    @SuppressLint("ResourceType")
    fun bindDaily(daily : Daily) {
        title.text = daily.title
        desc.text = daily.desc

        img.setImageResource(daily.img.toInt())

    }

}