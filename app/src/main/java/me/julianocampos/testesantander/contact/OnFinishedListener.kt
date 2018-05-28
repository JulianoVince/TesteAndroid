package me.julianocampos.testesantander.contact

import me.julianocampos.testesantander.webservice.CellResponse
/**
 * Created by julianocampos.
 */
interface OnFinishedListener {

    fun onSuccess(cellResponse: CellResponse)

    fun onError(errorMessage: String?)

}