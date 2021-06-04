package com.example.gniar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
// tanggal pengerjaan   : Senin, 31 Mei 2021
// nim                  : 10118901
// nama                 : Dedi Cahya
// kelas                : IF11k

class ViewPagerAdapter(fragmentManager : FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragments= listOf(
        Intro1Fragment(),
        Intro2Fragment(),
        Intro3Fragment()
    )
    override fun getCount(): Int {
        return fragments.size

    }
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }
}