package com.example.gniar.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.example.gniar.R
import edmt.dev.videoplayer.adapter.VideoPlayerRecyclerAdapter
import edmt.dev.videoplayer.model.MediaObject
import edmt.dev.videoplayer.utils.VerticalSpacingItemDecorator
import kotlinx.android.synthetic.main.fragment_fav.*
import java.util.*
import java.util.Arrays.asList
import kotlin.collections.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FavFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    private fun initVideo() {
        val layoutManager = LinearLayoutManager(activity)
        video_player.layoutManager = layoutManager
        val verticalItemDecor = VerticalSpacingItemDecorator(10)
        video_player.addItemDecoration(verticalItemDecor)

        val sourceVideos : ArrayList<MediaObject> = ArrayList(favs())
        video_player.setMediaObjects(sourceVideos)
        val adapter = VideoPlayerRecyclerAdapter(sourceVideos, initGlide())
        video_player.adapter = adapter
    }


    private fun initGlide() : RequestManager? {
        val options = RequestOptions()
            .placeholder(R.drawable.white_background)
            .error(R.drawable.white_background)
        return Glide.with(this).setDefaultRequestOptions(options)
    }
    private fun favs() : List<MediaObject> {
        return listOf(
            MediaObject("The Greatest Show","https://drive.google.com/file/d/1eTFX0KpQUog9bI5LQOe23K6B_FkgpErr/view","https://i.ytimg.com/vi/NyVYXRD1Ans/maxresdefault.jpg",""),
            MediaObject("The Greatest Show - The Other Side","http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4","https://i.ytimg.com/vi/NyVYXRD1Ans/maxresdefault.jpg",""),
            MediaObject("Unstoppable - SIA ","http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4","https://i.ytimg.com/vi/cxjvTXo9WWM/maxresdefault.jpg",""),
            MediaObject("We Don't Talk Anymore","http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4","https://i.ytimg.com/vi/3AtDnEC4zak/maxresdefault.jpg",""),

        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initVideo()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fav, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FavFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FavFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}