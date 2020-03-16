package co.prog.view.activity.camera

import co.prog.base.BaseContract

interface CameraContract {
    interface View: BaseContract.BaseView<Presenter>

    interface Presenter: BaseContract.BasePresenter{
    }
}