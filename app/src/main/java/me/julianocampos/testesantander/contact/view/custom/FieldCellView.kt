package me.julianocampos.testesantander.contact.view.custom

import android.view.ViewGroup
import me.julianocampos.testesantander.contact.FieldCell
import me.julianocampos.testesantander.contact.view.CellView
/**
 * Created by julianocampos.
 */
abstract class FieldCellView(fieldCell: FieldCell,
                             rootView: ViewGroup): CellView(fieldCell, rootView){

    abstract fun isValid(): Boolean

    abstract fun showError()

    abstract fun dismissError()

    abstract fun clear()

}