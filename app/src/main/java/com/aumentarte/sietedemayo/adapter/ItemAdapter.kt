package com.aumentarte.sietedemayo.adapter

import android.content.ClipData.Item
import android.content.Context
import android.service.media.MediaBrowserService.BrowserRoot
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aumentarte.sietedemayo.databinding.ItemListDataBinding

class ItemAdapter (

    private val itemList : List<Item>,
    private val context: Context,
    private val listener : SendItem) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){




    //clase interna puerto de entrada para los datos
    inner class ItemViewHolder(binding: ItemListDataBinding):
    RecyclerView.ViewHolder(binding.getRoot()), View.OnClickListener{


        val imageView :ImageView
        val textView :TextView

        init {
            imageView = binding.ivItem
            textView = binding.tvItem

            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            //escuchador
           // listener.setO

        }


    }

    interface SendItem{

        fun SendItem(item: Item?)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}
