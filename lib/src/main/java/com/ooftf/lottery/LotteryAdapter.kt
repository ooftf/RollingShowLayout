package com.ooftf.lottery

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by 99474 on 2018/1/11 0011.
 */
class LotteryAdapter(var context: Context, var recyclerView: RecyclerView) : RecyclerView.Adapter<LotteryViewHolder>() {
    var list: MutableList<PickBeen> = ArrayList()
    override fun onBindViewHolder(holder: LotteryViewHolder, position: Int) {
        holder.recyclerView.adapter = list[position].adapter
        holder.recyclerView.smoothScrollToPosition(list.get(position).selectIndex)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): LotteryViewHolder {
        val inflate = LayoutInflater.from(context).inflate(R.layout.item_lottery, parent, false)
        inflate.layoutParams.width = recyclerView.width / list.size
        var holder = LotteryViewHolder(inflate)
        var layoutManager = ScrollSpeedLinearLayoutManger(context, RecyclerView.VERTICAL, false)
        layoutManager.setSpeedSlow()
        holder.recyclerView.layoutManager = layoutManager
        return holder
    }
}