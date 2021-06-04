package com.example.gniar.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gniar.Fav
import com.example.gniar.FavAdapter
import com.example.gniar.R
import kotlinx.android.synthetic.main.fragment_fav.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FavFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfFav = listOf(
            Fav("Pop/Star - Kda (Live)","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/p9oDlvOV3qs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"),
            Fav("Driver License","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2PRvp-mP_q0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"),
            Fav("The Greatest Showman","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NyVYXRD1Ans\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"),
            Fav("Unstoppable - SIA","<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/h3h035Eyz5A?list=RDh3h035Eyz5A\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"),


        )
        val favAdapter = FavAdapter(listOfFav)
        rvListFav.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = favAdapter
        }


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