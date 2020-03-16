package co.prog.view.activity.main

import co.prog.base.BaseContract

interface MainContract {
    interface View: BaseContract.BaseView<Presenter>

    interface Presenter: BaseContract.BasePresenter{
    }
}