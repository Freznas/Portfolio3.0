package com.example.portfolio30

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


import com.example.portfolio30.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewPager = binding.viewPager

        binding.tabLayout.tabMode = TabLayout.MODE_FIXED
        val pagerAdapter = ViewPagerAdapter(this)
        binding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager)
        { tab, position ->



            when (position) {
                0 -> {

                    tab.icon = resources.getDrawable(R.drawable.project_icon, null)
                }


                1 -> {

                    tab.icon = resources.getDrawable(R.drawable.profile_icon, null)
                }


                2 -> {

                    tab.icon = resources.getDrawable(R.drawable.art_icon, null)
                }

                3 -> {
                    tab.icon = resources.getDrawable(R.drawable.social_icon, null)
                }
                4 -> {
                    tab.view.visibility = View.GONE
                }

            }

        }.attach()

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == pagerAdapter.itemCount - 1) {
                    // Scroll to first item when reaching the last item
                    viewPager.post { viewPager.setCurrentItem(0, false) }
                }


            }
        })
    }
}

