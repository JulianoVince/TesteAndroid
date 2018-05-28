package me.julianocampos.testesantander.investment.model.mapper

import me.julianocampos.testesantander.investment.model.Risk
import me.julianocampos.testesantander.webservice.Screen
/**
 * Created by julianocampos.
 */
object RiskMapper {

    fun map(screen: Screen) = Risk (
            screen.riskTitle,
            screen.risk
    )

}