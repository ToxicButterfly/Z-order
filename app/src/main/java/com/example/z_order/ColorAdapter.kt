package com.example.z_order

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout


class ColorAdapter(mainActivity: MainActivity, mColors: IntArray) : BaseAdapter() {


    private var mContext: Context? = null

    private var mColors: IntArray? = null

    override fun getCount(): Int {
        return if (mColors == null) 0 else mColors!!.size
    }

    override fun getItem(position: Int): Any? {
        return if (mColors == null) null else mColors!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, cacheView: View?, parent: ViewGroup?): View? {
        val colorLayoutParams = LinearLayout.LayoutParams(
            200, 300
        )
        val colorLayout = LinearLayout(mContext)
        colorLayout.setBackgroundColor(mColors!![position])
        colorLayout.layoutParams = colorLayoutParams
        return colorLayout
    }
}
