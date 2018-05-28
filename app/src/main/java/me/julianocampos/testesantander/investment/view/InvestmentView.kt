package me.julianocampos.testesantander.investment.view

import me.julianocampos.testesantander.base.BaseView
import me.julianocampos.testesantander.investment.model.Header
import me.julianocampos.testesantander.investment.model.Info
import me.julianocampos.testesantander.investment.model.MoreInfos
import me.julianocampos.testesantander.investment.model.Risk
/**
 * Created by julianocampos.
 */
interface InvestmentView : BaseView {

    fun setHeader(headerInfo: Header)

    fun setRisk(riskInfo: Risk)

    fun setMoreInfos(moreInfos: MoreInfos)

    fun setListInfos(infos: MutableList<Info>)

    fun setDownInfos(infos: MutableList<Info>)

    fun onError(txt: String?)

}