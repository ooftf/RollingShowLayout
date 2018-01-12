package com.ooftf.lottery

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by 99474 on 2018/1/11 0011.
 */
class LotteryViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var recyclerView: RecyclerView

    init {
        recyclerView = itemView as RecyclerView
    }
}