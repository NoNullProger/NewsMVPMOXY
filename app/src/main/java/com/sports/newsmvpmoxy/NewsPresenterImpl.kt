package com.sports.newsmvpmoxy

import com.arellomobile.mvp.InjectViewState

@InjectViewState
class NewsPresenterImpl() : NewsPresenter() {

    override fun showWorking() {
        viewState.showSuccess()
    }
}