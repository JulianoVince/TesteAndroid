package me.julianocampos.testesantander.contact.view

import me.julianocampos.testesantander.base.BaseView
import me.julianocampos.testesantander.contact.ContactLayout

/**
 * Created by julianocampos.
 */
interface ContactView : BaseView {

    fun showSuccessView()

    fun dismissSuccessView()

    fun onError(errorMessage: String?)

    fun getContactLayout(): ContactLayout

    fun clear()

    fun isContactError(): Boolean

    fun showError()

    fun dismissError()

    fun setListeners()

}