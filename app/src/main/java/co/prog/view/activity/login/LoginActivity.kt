package co.prog.view.activity.login

import android.graphics.Color
import android.view.View
import co.prog.R
import co.prog.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), LoginContract.View, View.OnClickListener {
    override val layoutRes: Int
        get() = R.layout.activity_login

    override lateinit var presenter : LoginContract.Presenter

    override fun initView() {
        presenter = LoginPresenter(this@LoginActivity, this)
        presenter.start()

        login_login_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.login_login_button -> presenter.login(login_id_edit.text.toString(),
                login_pw_edit.text.toString())
        }
    }

    override fun showErrorTheme() {
        login_id_exist.visibility = View.VISIBLE
        login_pw_exist.visibility = View.VISIBLE
        login_id_edit.setBackgroundResource(R.drawable.login_error_background)
        login_pw_edit.setBackgroundResource(R.drawable.login_error_background)
        login_id_edit.setTextColor(Color.parseColor("#272727"))
        login_pw_edit.setTextColor(Color.parseColor("#272727"))
    }

    override fun isViewActive(): Boolean = checkActive()
}
