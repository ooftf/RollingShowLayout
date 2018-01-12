package com.ooftf.lotterypick

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ooftf.lottery.R

/**
 * Created by 99474 on 2018/1/11 0011.
 */

class ItemAdapter(var context: Context) : RecyclerView.Adapter<LotteryItemViewHolder>() {
    var list = ArrayList<String>()
    override fun getItemCount(): Int {
        return list.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): LotteryItemViewHolder {
        return LotteryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_lottery_item, parent, false))
    }

    override fun onBindViewHolder(holder: LotteryItemViewHolder, position: Int) {
        holder.textView.text = list.get(position).toString()
    }
}