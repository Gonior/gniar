package com.example.gniar.menus

import android.os.Bundle
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
            Friend(name = "Agung Sepruloh", img="https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Friend(name = "Dedi Cahya", img="https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Friend(name = "Firman Alfinas", img = "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
        )

        val listDaily = listOf(
            Daily("Kerja", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus nulla turpis, non venenatis ante tincidunt eget. Nunc ultricies nisl eget lacus porttitor mattis. Aenean a neque non justo tempor mattis id et mauris. Morbi in venenatis quam. Aenean luctus fringilla diam, ac porttitor erat tempus at. Morbi felis odio", "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Daily("Kerja2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus nulla turpis, non venenatis ante tincidunt eget. Nunc ultricies nisl eget lacus porttitor mattis. Aenean a neque non justo tempor mattis id et mauris. Morbi in venenatis quam. Aenean luctus fringilla diam, ac porttitor erat tempus at. Morbi felis odio", "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Daily("Kerja3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus nulla turpis, non venenatis ante tincidunt eget. Nunc ultricies nisl eget lacus porttitor mattis. Aenean a neque non justo tempor mattis id et mauris. Morbi in venenatis quam. Aenean luctus fringilla diam, ac porttitor erat tempus at. Morbi felis odio", "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Daily("Kerja4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus nulla turpis, non venenatis ante tincidunt eget. Nunc ultricies nisl eget lacus porttitor mattis. Aenean a neque non justo tempor mattis id et mauris. Morbi in venenatis quam. Aenean luctus fringilla diam, ac porttitor erat tempus at. Morbi felis odio", "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80"),
            Daily("Kerja5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam finibus nulla turpis, non venenatis ante tincidunt eget. Nunc ultricies nisl eget lacus porttitor mattis. Aenean a neque non justo tempor mattis id et mauris. Morbi in venenatis quam. Aenean luctus fringilla diam, ac porttitor erat tempus at. Morbi felis odio", "https://images.unsplash.com/photo-1622107562067-394847606d42?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=333&q=80")
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