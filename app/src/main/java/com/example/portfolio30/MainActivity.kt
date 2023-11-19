package com.example.portfolio30
//Here we handle the main layout throughout the application that handles the functionality of the swiping and the meny at the top.
//This does not handle the separate layout for the individual project pages.

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.portfolio30.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
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

        fun startMusic() {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.start()
            }
        }

        fun stopMusic() {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }

    }


