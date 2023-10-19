package com.develap.dortmundinfo.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.develap.dortmundinfo.App
import com.develap.dortmundinfo.data.db.table.TeamInfoTable
import com.develap.dortmundinfo.domain.Iterator
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainInfoFragmentViewModel : ViewModel() {

    @Inject
    lateinit var iterator: Iterator
    val teamInfoData: LiveData<TeamInfoTable>

    init {
        App.instance.dagger.inject(this)
        iterator.getTeamInfoFromApi()
        teamInfoData = iterator.getTeamInfoFromDb()
    }


}