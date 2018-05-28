package me.julianocampos.testesantander.webservice

import me.julianocampos.testesantander.contact.Cell

/**
 * Created by julianocampos.
 */
data class CellResponse(
        val cells: MutableList<Cell>
)