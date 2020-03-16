package co.prog.view.activity.success

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import co.prog.R
import co.prog.base.BaseActivity

class SuccessActivity : BaseActivity(), SuccessContract.View, View.OnClickListener {
    override val layoutRes: Int
        get() = R.layout.activity_success

    override lateinit var presenter : SuccessContract.Presenter

    override fun initView() {
        presenter = SuccessPresenter(this@SuccessActivity, this)
        presenter.start()
    }

    override fun onClick(v: View) {
        when(v.id){

        }
    }

    override fun isViewActive(): Boolean = isViewActive()
}
