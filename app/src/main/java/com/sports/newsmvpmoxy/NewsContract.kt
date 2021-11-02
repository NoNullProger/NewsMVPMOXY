package com.sports.newsmvpmoxy

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.*

@StateStrategyType(AddToEndStrategy::class)
interface NewsContract : MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showSuccess()

}

abstract class NewsPresenter: BasePresenter<NewsContract>() {

    abstract fun showWorking()

}