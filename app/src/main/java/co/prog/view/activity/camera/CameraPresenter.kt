package co.prog.view.activity.camera

import android.content.Context

class CameraPresenter(private val view: CameraContract.View, context: Context): CameraContract.Presenter {
    override fun start() {
        view.presenter = this
    }
}