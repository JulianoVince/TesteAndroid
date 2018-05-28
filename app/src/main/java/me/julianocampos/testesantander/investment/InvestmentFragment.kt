package me.julianocampos.testesantander.investment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_investment.*
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.base.BaseFragment
import me.julianocampos.testesantander.investment.model.Header
import me.julianocampos.testesantander.investment.model.Info
import me.julianocampos.testesantander.investment.model.MoreInfos
import me.julianocampos.testesantander.investment.model.Risk
import me.julianocampos.testesantander.investment.view.InvestmentView
import kotlin.properties.Delegates
/**
 * Created by julianocampos.
 */
class InvestmentFragment : BaseFragment(), InvestmentView {

    var mPresenter: InvestmentPresenterImpl by Delegates.notNull()

    override fun onError(txt: String?) {
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_investment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPresenter = InvestmentPresenterImpl(activity as Context, this)

        initData()
    }

    fun initData() {
        mPresenter.getFund()
    }

    override fun setHeader(header: Header) {
        headerView.setInfos(header)
    }

    override fun setRisk(risk: Risk) {
        riskScale.setRiskInfo(risk)
    }

    override fun setMoreInfos(moreInfos: MoreInfos) {
        moreInfo.setMoreInfos(moreInfos)
    }

    override fun setListInfos(infos: MutableList<Info>) {
        infoList.setInfos(infos)
    }

    override fun setDownInfos(infos: MutableList<Info>) {
        infoDown.setInfosDown(infos)
    }

}