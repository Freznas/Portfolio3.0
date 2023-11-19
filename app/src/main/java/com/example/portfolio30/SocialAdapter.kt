package com.example.portfolio30
// This Adapter handles my SocialList and RecyclerView to view and make sure my clicklistener links to the correct sites.
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import com.example.portfolio30.databinding.ListProjectBinding

class SocialAdapter(val socialList: List<Project>, val clickListener: (Project) -> Unit) :
    RecyclerView.Adapter<SocialAdapter.ViewHolder>() {

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
        return socialList.size


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = socialList[position]
        holder.tvName.text = item.name
        holder.tvDescription.text = item.description
        holder.imgView.setImageResource(item.imgSrc)
        holder.cardView.setOnClickListener {
            val url = item.description
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            it.context.startActivity(intent)


        }
    }

}