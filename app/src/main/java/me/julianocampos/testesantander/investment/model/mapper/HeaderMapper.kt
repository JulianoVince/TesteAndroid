package me.julianocampos.testesantander.investment.model.mapper

import me.julianocampos.testesantander.investment.model.Header
import me.julianocampos.testesantander.webservice.Screen
/**
 * Created by julianocampos.
 */
object HeaderMapper {

    fun map(screen: Screen) = Header(
            screen.title,
            screen.fundName,
            screen.whatIs,
            screen.definition
    )

}