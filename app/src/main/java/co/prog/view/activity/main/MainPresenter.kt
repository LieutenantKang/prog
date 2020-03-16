package co.prog.view.activity.main

import android.content.Context

class MainPresenter(private val view: MainContract.View, context: Context): MainContract.Presenter {
    override fun start() {
        view.presenter = this
    }
}