package me.julianocampos.testesantander.contact.view.custom

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.contact.Cell
import me.julianocampos.testesantander.contact.view.CellView
/**
 * Created by julianocampos.
 */
class SendCellView(private val sendFieldCell: Cell,
                   rootView: ViewGroup): CellView(sendFieldCell, rootView) {

    init {
        this.inflateView()
    }

    override fun inflateView() {
        inflateLayout(R.layout.send_cell_view)

        (this.view as Button).text = sendFieldCell.message
    }

    fun setSendListener(clickListener: View.OnClickListener){
        this.view.setOnClickListener(clickListener)
    }

}