package com.sports.newsmvpmoxy

import android.os.Bundle
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.sports.newsmvpmoxy.databinding.ActivityNewsBinding

class NewsActivity : MvpAppCompatActivity(), NewsContract {

    private lateinit var binding: ActivityNewsBinding

    @InjectPresenter
    lateinit var presenter: NewsPresenter

    @ProvidePresenter
    fun providePresenter(): NewsPresenter {
        return NewsPresenterImpl()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.showWorking()
    }

    override fun showSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()
    }
}