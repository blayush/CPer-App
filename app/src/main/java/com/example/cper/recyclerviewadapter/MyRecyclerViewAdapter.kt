package com.example.cper.recyclerviewadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cper.R

class MyRecyclerViewAdapter: RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) :RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // convert our single_view_recycler to itemView so tha we can use it in viewHolder
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.single_view_recycler,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // sets value into our view
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}