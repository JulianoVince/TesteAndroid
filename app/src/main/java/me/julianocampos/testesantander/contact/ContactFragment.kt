package me.julianocampos.testesantander.contact

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.success_sent.*
import me.julianocampos.testesantander.R
import me.julianocampos.testesantander.base.BaseFragment
import me.julianocampos.testesantander.contact.view.ContactView
import me.julianocampos.testesantander.webservice.CellResponse
import kotlin.properties.Delegates
/**
 * Created by julianocampos.
 */
class ContactFragment : BaseFragment(), ContactView {
    override fun getContactLayout(): ContactLayout {
        return contactLayout
    }

    override fun isContactError(): Boolean {
        return contactLayout.checkErrors()
    }

    override fun showError() {
        dismissError()
        contactLayout.showError()
    }

    override fun dismissError() {
        contactLayout.dismissError()
    }

    override fun showSuccessView() {
        contactLayout.visibility = View.GONE
        successView.visibility = View.VISIBLE
    }

    override fun dismissSuccessView() {
        contactLayout.visibility = View.VISIBLE
        successView.visibility = View.GONE
    }

    override fun clear() {
        contactLayout.clearAll()
    }

    override fun setListeners() {
        contactLayout.setSendButtonListener(View.OnClickListener {
            mPresenter.onSendEventClicked()
        })

        btnSendNewMessage.setOnClickListener { mPresenter.onNewMessageClicked() }
    }

    override fun onError(errorMessage: String?) {

    }

    var mPresenter: ContactPresenterImpl by Delegates.notNull()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPresenter = ContactPresenterImpl(activity as Context, this)
        initData()
    }

    fun initData() {
        mPresenter.getData()
    }

}