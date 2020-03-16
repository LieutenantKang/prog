package co.prog.view.activity.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import co.prog.R
import co.prog.base.BaseActivity
import co.prog.view.activity.camera.CameraActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainContract.View, View.OnClickListener {
    override val layoutRes: Int
        get() = R.layout.activity_main

    override lateinit var presenter : MainContract.Presenter

    override fun initView() {
        presenter = MainPresenter(this@MainActivity, this)
        presenter.start()

        main_camera_button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.main_camera_button -> startActivity(Intent(this, CameraActivity::class.java))
        }
    }

    override fun isViewActive(): Boolean = checkActive()
}
