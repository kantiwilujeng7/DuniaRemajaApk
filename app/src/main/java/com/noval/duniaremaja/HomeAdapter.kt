package com.noval.duniaremaja

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.home_item.*

class HomeAdapter (private val context: Context, private val items:ArrayList<Home>):
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.home_item, parent,  false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView:View):
        RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun bindItem(item:Home) {
            text_judul.text=item.judul
            text_pengarang.text=item.pengarang
            image_poster.setImageResource(item.image_id)

        }
    }
    }
