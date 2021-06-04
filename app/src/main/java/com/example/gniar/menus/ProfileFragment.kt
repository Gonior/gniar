package com.example.gniar.menus

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.gniar.MapsActivity
import com.example.gniar.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapsInitializer
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.dialog.*
import kotlinx.android.synthetic.main.fragment_profile.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    private fun composeEmail(addresses: Array<String>, subject: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "*/*"
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, subject)

        }
        startActivity(intent)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_app_ver.setOnClickListener {
            val myDialogView = LayoutInflater.from(activity).inflate(R.layout.dialog, null)
            val mBuilder = AlertDialog.Builder(activity).setView(myDialogView).setTitle("Application Version")

            val mAlertDialog = mBuilder.show()

            mAlertDialog.btn_ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }

        btn_loc.setOnClickListener {
            val mapIntent = Intent(activity,MapsActivity::class.java)
            startActivity(mapIntent)
        }
        btn_tele.setOnClickListener {
            val telegram = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Gonnior"))
            startActivity(telegram)
        }
        btn_wa.setOnClickListener {
            val telegram = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281223829057"))
            startActivity(telegram)
        }
        btn_phone.setOnClickListener {
            val wa = Intent(Intent.ACTION_VIEW, Uri.parse("tel:62-8122-3829-057"))
            startActivity(wa)
        }
        btn_mail.setOnClickListener {
            composeEmail(arrayOf("arthemuss14@gmail.com" ), "From Gniar Apps")
        }




    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}