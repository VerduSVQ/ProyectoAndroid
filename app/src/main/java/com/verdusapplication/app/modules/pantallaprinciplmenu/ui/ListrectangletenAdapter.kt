package com.verdusapplication.app.modules.pantallaprinciplmenu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.verdusapplication.app.R
import com.verdusapplication.app.databinding.RowListrectangletenBinding
import com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model.ListrectangletenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangletenAdapter(
  var list: List<ListrectangletenRowModel>
) : RecyclerView.Adapter<ListrectangletenAdapter.RowListrectangletenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangletenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleten,parent,false)
    return RowListrectangletenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangletenVH, position: Int) {
    val listrectangletenRowModel = ListrectangletenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangletenRowModel = list[position]
    holder.binding.listrectangletenRowModel = listrectangletenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangletenRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListrectangletenRowModel
    ) {
    }
  }

  inner class RowListrectangletenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangletenBinding = RowListrectangletenBinding.bind(itemView)
    init {
      binding.linearRowrectangleten.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangletenRowModel())
      }
    }
  }
}
