package co.prog.view.activity.login

import co.prog.base.BaseContract

interface LoginContract {
    interface Model{
        interface LoginFinishedListener{
            fun loginFinished()
            fun loginFailed()
        }
        fun login(username: String, password: String, listener: LoginFinishedListener)
    }

    interface View: BaseContract.BaseView<Presenter>{
        fun showExistText()
    }

    interface Presenter: BaseContract.BasePresenter{
        fun login(username: String, password: String)
    }
}