package com.example.privatebank.ui.start.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.privatebank.R
import com.example.privatebank.model.BezNalDtoItem
import kotlinx.android.synthetic.main.item_beznal.view.*

class BeznalAdapter() : RecyclerView.Adapter<BeznalAdapter.BeznalViewHolder>() {
private var items = emptyList<BezNalDtoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BeznalViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_beznal, parent, false)
    )

    override fun onBindViewHolder(holder: BeznalViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun update(newsList: List<BezNalDtoItem>) {
      items = newsList
        notifyDataSetChanged()
    }

    inner class BeznalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: BezNalDtoItem) {
            itemView.item_ccy.text = item.ccy
            itemView.item_buy.text = item.buy
            itemView.item_sale.text = item.sale

        }
    }
}