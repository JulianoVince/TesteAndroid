package me.julianocampos.testesantander.investment.model.mapper

import me.julianocampos.testesantander.investment.model.Info
import me.julianocampos.testesantander.investment.model.MoreInfos
import me.julianocampos.testesantander.webservice.Screen
/**
 * Created by julianocampos.
 */
object MoreInfosMapper {

    fun map(screen: Screen) = MoreInfos(
            screen.infoTitle,
            Info(screen.monthInfo.fund.toString(), screen.monthInfo.cdi.toString()),
            Info(screen.yearInfo.fund.toString(), screen.yearInfo.cdi.toString()),
            Info(screen.twelveInfo.fund.toString(), screen.twelveInfo.cdi.toString())
    )

}