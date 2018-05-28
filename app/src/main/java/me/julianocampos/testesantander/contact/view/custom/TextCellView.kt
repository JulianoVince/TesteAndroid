package me.julianocampos.testesantander.contact.view.custom

import android.view.ViewGroup
import android.widget.TextView
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.contact.Cell
import me.julianocampos.testesantander.contact.view.CellView
/**
 * Created by julianocampos.
 */
class TextCellView(private val textCell: Cell, rootView: ViewGroup): CellView(textCell, rootView) {

    init { inflateView() }

    override fun inflateView() {
        inflateLayout(R.layout.text_view)
        (this.view as TextView).text = textCell.message
    }

}