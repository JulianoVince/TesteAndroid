package me.julianocampos.testesantander.contact.view

import me.julianocampos.testesantander.contact.FieldCell
import java.util.regex.Pattern
/**
 * Created by julianocampos.
 */
const val PHONE_NUMBER_REGEX = "\\(\\d{2}\\)\\d{5}-\\d{4}"

class PhoneNumberFieldCell(id: Int = -1,
                           type: Int = 1,
                           message: String = "",
                           typeField: Int = 2,
                           hidden: Boolean = false,
                           topSpacing: Double = 8.0,
                           show: Int = -1,
                           required: Boolean = false) :
        FieldCell(id, type, message, typeField, hidden, topSpacing, show, required){

    private val PHONE_NUMBER_PATTERN = Pattern
            .compile(PHONE_NUMBER_REGEX,
                    Pattern.CASE_INSENSITIVE)

    override fun validate(response: String) = PHONE_NUMBER_PATTERN.matcher(response).find()
}