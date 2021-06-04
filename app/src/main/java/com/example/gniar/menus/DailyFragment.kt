package com.example.gniar.menus

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gniar.*
import kotlinx.android.synthetic.main.fragment_daily.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DailyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DailyFragment : Fragment() {
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



        val listFriends = listOf(
            Friend(name = "Agung Sepruloh", img=R.raw.fagung.toString()),
            Friend(name = "Jarkasih", img=R.raw.fjarkasih.toString()),
            Friend(name = "Firman Alfinas", img = R.raw.ffirman.toString()),
            Friend(name = "Ridwan", img = R.raw.fridwan.toString()),
            Friend("Burhan", R.raw.aburhan2.toString())
        )

        val listDaily = listOf(
            Daily("Bekerja", "Bekerja bagai kuda :v", R.raw.akerja.toString()),
            Daily("Ngoding", "Ngoding bagai kuda", R.raw.angoding.toString()),
            Daily("Mabar", "Isqiqomah walau deadline udah mepet.", R.raw.amabar.toString()),
            Daily("Sadboy", "Belum bisa move on :(", R.raw.asadboy.toString()),
            Daily("Photographing", "Disuruh jadi tukang foto", R.raw.afoto2.toString())
        )

        val dailyListAdapter = DailyListAdapter(listDaily)
        rvDailyList.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = dailyListAdapter
        }
        val horizontalAdapter = HorizontalAdapter(listFriends)
        rvFriendList.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = horizontalAdapter
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DailyFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DailyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
