package com.develap.dortmundinfo.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.develap.dortmundinfo.App
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.domain.Iterator
import javax.inject.Inject

class MainInfoFragmentViewModel : ViewModel() {

    @Inject
    lateinit var iterator: Iterator
    private val teamInfoLD: LiveData<TeamInfoTable>

    init {
        App.instance.dagger.inject(this)
        teamInfoLD = iterator.getTeamInfoFromDb()
    }

    fun getTeamInfoFromApi() {
        iterator.getTeamInfoFromApi()
    }


}