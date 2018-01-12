package com.ooftf.lottery

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.FrameLayout

/**
 * Created by 99474 on 2018/1/11 0011.
 */
class LotteryPickLayout : FrameLayout {
    var recycler: RecyclerView
    var adapter: LotteryAdapter

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_recyclerview, this)
        recycler = findViewById(R.id.recycler)
        var layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recycler.layoutManager = layoutManager
        adapter = LotteryAdapter(context,recycler)
        recycler.adapter = adapter
    }

    fun setItemList(list: ArrayList<PickBeen>) {
        adapter.list = list
        adapter.notifyDataSetChanged()
    }
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return false
    }
}