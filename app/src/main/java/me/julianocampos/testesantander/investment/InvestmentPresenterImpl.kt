package me.julianocampos.testesantander.investment

import android.app.Activity
import android.content.Context
import me.julianocampos.testesantander.investment.model.mapper.*
import me.julianocampos.testesantander.investment.view.InvestmentView
import me.julianocampos.testesantander.webservice.InvestmentResponseFormated
import me.julianocampos.testesantander.webservice.Screen
import kotlin.properties.Delegates

/**
 * Created by julianocampos.
 */
class InvestmentPresenterImpl : InvestmentPresenter, OnInvestmentFinishedListener {

    var context: Context by Delegates.notNull()
    var view: InvestmentView by Delegates.notNull()
    var interactor: InvestmentInteractor by Delegates.notNull()

    constructor(context: Context, view: InvestmentView) {
        this.view = view
        this.context = context
        this.interactor = InvestmentInteractorImpl()
    }

    override fun getFund() {
        view.showLoading()
        interactor.getFund(context, this)
    }

    override fun onSuccess(investmentResponse: InvestmentResponseFormated) {
        (context as Activity).runOnUiThread {
            view.dismissLoading()
            proccessResponse(investmentResponse.screen)
        }
    }

    override fun onError(errorMessage: String?) {
        (context as Activity).runOnUiThread {
            view.dismissLoading()
            view.onError(errorMessage)
        }
    }

    private fun proccessResponse(screen: Screen) {
        view.setHeader(HeaderMapper.map(screen))
        view.setRisk(RiskMapper.map(screen))
        view.setMoreInfos(MoreInfosMapper.map(screen))
        view.setListInfos(InfosMapper.map(screen))
        view.setDownInfos(DownInfosMapper.map(screen))
    }
}

interface InvestmentPresenter {
    fun getFund()
}
