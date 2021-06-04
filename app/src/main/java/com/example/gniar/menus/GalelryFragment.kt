package com.example.gniar.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.example.gniar.GalelryListAdapter
import com.example.gniar.Img
import com.example.gniar.R
import kotlinx.android.synthetic.main.fragment_galelry.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GalelryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

class GalelryFragment : Fragment() {
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
        val listOfImg = listOf(
            Img("", R.raw.amabar.toString()),
            Img("", R.raw.afoto.toString()),
            Img("", R.raw.asadboy.toString()),
            Img("", R.raw.ffirman.toString()),
            Img("", R.raw.angoding.toString()),
            Img("", R.raw.afoto2.toString()),
            Img("", R.raw.gabut.toString()),
            Img("", R.raw.fagung.toString()),
            Img("", R.raw.fjarkasih.toString()),
            Img("", R.raw.aburhan2.toString()),

        )
        val galelryListAdapter = GalelryListAdapter(listOfImg)
        rvGaleryList.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = galelryListAdapter
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galelry, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GalelryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GalelryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}