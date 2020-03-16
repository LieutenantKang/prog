package co.prog.view.activity.camera

import android.content.Intent
import co.prog.R
import co.prog.base.BaseActivity
import co.prog.view.activity.success.SuccessActivity
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult

class CameraActivity : BaseActivity(), CameraContract.View{
    override val layoutRes: Int
        get() = R.layout.activity_camera

    override lateinit var presenter : CameraContract.Presenter

    override fun initView() {
        presenter = CameraPresenter(this@CameraActivity, this)
        presenter.start()

        val integrator = IntentIntegrator(this)
        integrator.setOrientationLocked(true)
        integrator.setPrompt("")
        integrator.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result: IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)

        if(result.contents != null) {
            startActivity(Intent(this, SuccessActivity::class.java))
        }else{
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun isViewActive(): Boolean = checkActive()
}
