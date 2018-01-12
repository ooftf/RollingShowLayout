package com.ooftf.lotterypick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.ooftf.lottery.PickBeen
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var itemAdapter = ItemAdapter(this)
        (0..30).forEach {
            itemAdapter.list.add(it.toString())
        }
        var list = ArrayList<PickBeen>()
        list.add(PickBeen(itemAdapter, 0))
        list.add(PickBeen(itemAdapter, 25))
        list.add(PickBeen(itemAdapter, 12))
        list.add(PickBeen(itemAdapter, 23))
        list.add(PickBeen(itemAdapter, 12))
        list.add(PickBeen(itemAdapter, 5))
        list.add(PickBeen(itemAdapter, 18))
        list.add(PickBeen(itemAdapter, 25))
        list.add(PickBeen(itemAdapter, 12))
        list.add(PickBeen(itemAdapter, 18))
        list.add(PickBeen(itemAdapter, 3))
        lotteryPick.setItemList(list)
    }
}
