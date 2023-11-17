package com.example.portfolio30

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio30.databinding.FragmentProjectBinding
import com.example.portfolio30.databinding.FragmentSocialBinding


open class SocialFragment : Fragment() {
    lateinit var binding: FragmentSocialBinding
    val socialList = listOf(

        Project(
            "Instagram", "https://www.instagram.com/joakim_karl/",
            R.drawable.insta_image
        ),
        Project(
            "LinkedIn", "https://www.linkedin.com/in/joakim-bj%C3%A4rkstedt-57294b99/",
            R.drawable.linkedin_image
        ),
        Project(
            "GitHub", "https://github.com/Freznas",
            R.drawable.github_image)



    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSocialBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.rvProjectlist
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())

        recyclerView.layoutManager = layoutManager

        val adapter = ProjectAdapter(socialList) { project ->

        }
        recyclerView.adapter = adapter

    }
}