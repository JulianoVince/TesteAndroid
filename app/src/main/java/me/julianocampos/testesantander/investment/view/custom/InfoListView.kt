package me.julianocampos.testesantander.investment.view.custom

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.info_list_view.view.*
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.investment.model.Info
/**
 * Created by julianocampos.
 */
class InfoListView(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.info_list_view, this)
    }

    fun setInfos(infoList: MutableList<Info>){
        val adapter = InfoAdapter(infoList)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    fun setInfosDown(infoList: MutableList<Info>){
        val adapter = InfoDownAdapter(infoList)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

}