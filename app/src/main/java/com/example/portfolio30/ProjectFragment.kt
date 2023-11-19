package com.example.portfolio30

//This is the fragment that handles the Projectlist and communicates with the XML and the ProjedtAdapter to display the information and handle clickability.
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio30.databinding.FragmentProjectBinding

open class ProjectFragment : Fragment() {


    lateinit var binding: FragmentProjectBinding
    val projectList = listOf(

        Project(
            "Portfolio", "här är min Github länk till denna portfolio Appen",
            R.drawable.kodsnutt_portfolio
        ),
        Project(
            "NotePad", "här är min NotePad app jag skapat i utbildningen enligt " +
                    "MVC arkitektur",
            R.drawable.notepad_exempel
        ),
        Project(
            "Giuseppe's trattoria", "En enkel meny app som vi skapade i utbildningen",
            R.drawable.restaurant_project
        ),
        Project(
            "Furious Criminal's Kalkylator", "vårat första mindre grupparbete " +
                    "där vi utvecklade en enkel kalkylator applikation",
            R.drawable.grupp_kalkylator
        ),
        Project(
            "BMI Kalkylatorn ", "min första app " ,
            R.drawable.bmi_project
        ),

        Project(
            "Blender Portfolio",
            "mitt egna tidigare verk från komvux " +
                    "där jag skapade 3d designer av en hammare och en läskburk",
            R.drawable.blender_icon
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProjectBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.rvProjectlist
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())

        recyclerView.layoutManager = layoutManager

        val adapter = ProjectAdapter(projectList) { project ->

        }
        recyclerView.adapter = adapter

    }
}
