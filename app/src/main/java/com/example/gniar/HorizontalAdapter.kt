package com.example.gniar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_friend.view.*

// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k


class HorizontalAdapter(private val friends : List<Friend>) : RecyclerView.Adapter<FriendHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FriendHolder {
        return FriendHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_friend, viewGroup, false))
    }

    override fun getItemCount(): Int = friends.size

    override fun onBindViewHolder(holder: FriendHolder, position: Int) {
        holder.bindFriend(friends[position])
    }
}
class FriendHolder(view : View) : RecyclerView.ViewHolder(view) {
    private val nameOfFriends = view.nameOfFriends
    private val img = view.img
    fun bindFriend(friend: Friend) {
        nameOfFriends.text = friend.name
        img.setImageResource(friend.img.toInt())
    }
}
