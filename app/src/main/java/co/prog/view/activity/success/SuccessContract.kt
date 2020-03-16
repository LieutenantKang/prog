package co.prog.view.activity.success

import co.prog.base.BaseContract

interface SuccessContract {
    interface View: BaseContract.BaseView<Presenter>

    interface Presenter: BaseContract.BasePresenter{
    }
}