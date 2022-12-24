package com.example.flyy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(private var developer: List<Developer>):RecyclerView.Adapter<DeveloperAdapter.DeveloperViewHolder>() {

    class DeveloperViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.developerImage)
        val name=itemView.findViewById<TextView>(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_for_rec2,parent,false)
        return DeveloperViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
        val developerL=developer[position]
        holder.image.setImageResource(developerL.image)
        holder.name.text=developerL.name
    }

    override fun getItemCount(): Int {
        return developer.size
    }
}