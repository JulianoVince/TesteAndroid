package me.julianocampos.testesantander.investment.model.mapper

import me.julianocampos.testesantander.investment.model.Info
import me.julianocampos.testesantander.webservice.Screen
/**
 * Created by julianocampos.
 */
object InfosMapper {

    fun map(screen: Screen): MutableList<Info> {
        val listInfos = mutableListOf<Info>()

        screen.info.mapTo(listInfos, { info -> Info(info.name, info.data ?: "")})

        return listInfos
    }

}