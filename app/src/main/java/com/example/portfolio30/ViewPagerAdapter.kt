package com.example.portfolio30

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val itemCount = 5
    override fun getItemCount(): Int = itemCount


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 ->
                ProjectFragment()


            1 ->
                ProfileFragment()


            2 ->
                ArtFragment()

            3 -> SocialFragment()


            else ->
                BlankFragment()


        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() % itemCount
    }
}
