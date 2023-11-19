package com.example.portfolio30
// This adapter handles my projectList and recyclerView functionallity.
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import com.example.portfolio30.databinding.ListProjectBinding

class ProjectAdapter(val projectList: List<Project>, val clickListener: (Project) -> Unit) :
    RecyclerView.Adapter<ProjectAdapter.ViewHolder>() {

    class ViewHolder(binding: ListProjectBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvName: TextView = binding.tvTitle
        val tvDescription: TextView = binding.tvContent
        val imgView: ImageView = binding.ivProfile
        val cardView: CardView = binding.root

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListProjectBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return projectList.size


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = projectList[position]

        holder.tvName.text = item.name
        holder.tvDescription.text = item.description
        holder.imgView.setImageResource(item.imgSrc)


        holder.cardView.setOnClickListener {

            val context = it.context
            val intent = when (position) {
                0 -> Intent(context, PortfolioActivity::class.java)
                1 -> Intent(context, NotepadActivity::class.java)
                2 -> Intent(context, RestaurantActivity::class.java)
                3 -> Intent(context, CalculatorActivity::class.java)
                4 -> Intent(context, BmiCalculatorActivity::class.java)
                5 -> Intent(context, BlenderActivity::class.java)
                else -> null
            }
            intent?.let {
                context.startActivity(it)
            }


        }
    }

}