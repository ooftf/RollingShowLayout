package com.ooftf.lotterypick

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by 99474 on 2018/1/11 0011.
 */
class LotteryItemViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var textView: TextView
    init {
        textView = itemView as TextView
    }
}