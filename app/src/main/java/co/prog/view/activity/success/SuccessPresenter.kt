package co.prog.view.activity.success

import android.content.Context

class SuccessPresenter (private val view: SuccessContract.View, context: Context): SuccessContract.Presenter {
    override fun start() {
        view.presenter = this
    }
}