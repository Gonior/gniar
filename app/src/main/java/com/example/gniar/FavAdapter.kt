package com.example.gniar

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_daily.view.*
import kotlinx.android.synthetic.main.item_daily.view.title
import kotlinx.android.synthetic.main.item_fav.view.*

data class Fav(val title :String, val urlStr : String)
class FavAdapter(private val favs:List<Fav>) : RecyclerView.Adapter<FavHolder>() {

    override fun getItemCount(): Int {
        return favs.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: FavHolder, position: Int) {
        holder.binFav(favs[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavHolder {
        return FavHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_fav, parent, false))
    }
}
class FavHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val video_player = view.wv
    private val title = view.title
    @RequiresApi(Build.VERSION_CODES.O)
    fun binFav(fav: Fav) {
        title.text = fav.title
        video_player.loadData(fav.urlStr, "text/html", "utf-8")
        video_player.webViewClient = WebViewClient()
        video_player.webChromeClient = WebChromeClient()
        video_player.settings.javaScriptEnabled = true
    }
}


