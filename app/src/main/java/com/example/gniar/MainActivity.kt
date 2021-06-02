package com.example.gniar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.gniar.menus.*

import com.example.gniar.room.PersonalDB
import kotlinx.android.synthetic.main.activity_main.*

// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val dailyFragment = DailyFragment()
    private val galelryFragment = GalelryFragment()
    private val favFragment = FavFragment()
    private val profileFragment = ProfileFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(homeFragment)
                R.id.daily -> replaceFragment(dailyFragment)
                R.id.gallery -> replaceFragment(galelryFragment)
                R.id.fav -> replaceFragment(favFragment)
                R.id.profile -> replaceFragment(profileFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        if(fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.flFragment, fragment)
            transaction.commit()
        }
    }
}