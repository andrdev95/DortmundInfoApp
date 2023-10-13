package com.develap.dortmundinfo.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.develap.dortmundinfo.App
import com.develap.dortmundinfo.domain.Iterator
import javax.inject.Inject

class TournamentListFragmentViewModel : ViewModel() {

    //Инициализируем интератор
    @Inject
    lateinit var iterator: Iterator

    init {
        App.instance.dagger.inject(this)
    }
}