package co.prog.view.activity.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            R.id.login_login_button -> presenter.login(login_name_edit.text.toString(),
                login_pw_edit.text.toString())
        }
    }

    override fun showExistText() {
        login_name_exist.visibility = View.VISIBLE
        login_pw_exist.visibility = View.VISIBLE
    }

    override fun isViewActive(): Boolean = checkActive()
}
