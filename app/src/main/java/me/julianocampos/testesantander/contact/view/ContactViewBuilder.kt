package me.julianocampos.testesantander.contact.view

import me.julianocampos.testesantander.base.Type
import me.julianocampos.testesantander.contact.Cell
import me.julianocampos.testesantander.contact.ContactLayout
import me.julianocampos.testesantander.contact.FieldCell
import me.julianocampos.testesantander.contact.view.custom.CheckboxCellView
import me.julianocampos.testesantander.contact.view.custom.SendCellView
import me.julianocampos.testesantander.contact.view.custom.TextCellView
import me.julianocampos.testesantander.contact.view.custom.TextFieldCellView
/**
 * Created by julianocampos.
 */
class ContactViewBuilder(private val rootView: ContactLayout) {

    fun proccessCellsFormView(cells: MutableList<Cell>): MutableList<CellView>{
        val listCellView = mutableListOf<CellView>()

        cells.forEach { cell ->
            listCellView.add(getCellView(cell))
        }

        rootView.setCellsView(listCellView)

        return listCellView
    }

    private fun getCellView(cell: Cell): CellView {
        return when (cell.type) {
            Type.field.position -> TextFieldCellView(cell as FieldCell, rootView)
            Type.text.position -> TextCellView(cell, rootView)
            Type.checkbox.position -> CheckboxCellView(cell, rootView)
            Type.send.position -> SendCellView(cell, rootView)
            else -> TextCellView(cell, rootView)
        }
    }
}