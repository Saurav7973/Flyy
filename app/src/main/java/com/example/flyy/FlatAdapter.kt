package com.example.flyy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlatAdapter(private val Flatlist:List<Flat>) : RecyclerView.Adapter<FlatAdapter.FlatViewHolder>(){

    class FlatViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val description=itemView.findViewById<TextView>(R.id.text)
        val location=itemView.findViewById<TextView>(R.id.location)
        val society=itemView.findViewById<TextView>(R.id.society)
        val rate=itemView.findViewById<TextView>(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlatViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_for_rec1,parent,false)
        return FlatViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlatViewHolder, position: Int) {
        val Flat=Flatlist[position]
        holder.image.setImageResource(Flat.flatimage)
        holder.description.text=Flat.description
        holder.location.text=Flat.loc
        holder.society.text=Flat.socity
        holder.rate.text= Flat.rate.toString()

    }

    override fun getItemCount(): Int {
        return Flatlist.size
    }
}