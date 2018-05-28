package me.julianocampos.testesantander.investment

import me.julianocampos.testesantander.webservice.InvestmentResponseFormated
/**
 * Created by julianocampos.
 */
interface OnInvestmentFinishedListener {

    fun onSuccess(investmentResponse: InvestmentResponseFormated)

    fun onError(errorMessage: String?)

}