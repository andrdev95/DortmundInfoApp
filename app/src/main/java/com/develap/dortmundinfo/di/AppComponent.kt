package com.develap.dortmundinfo.di

import com.develap.dortmundinfo.di.modules.DatabaseModule
import com.develap.dortmundinfo.di.modules.DomainModule
import com.develap.dortmundinfo.di.modules.RemoteProvider
import com.develap.dortmundinfo.presentation.viewModel.MainInfoFragmentViewModel
import com.develap.dortmundinfo.presentation.viewModel.PlayersViewModel
import com.develap.dortmundinfo.presentation.viewModel.TournamentListFragmentViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteProvider::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {

    //методы для того, чтобы появилась возможность внедрять зависимости во фрагменты
    fun inject(mainInfoFragmentViewModel: MainInfoFragmentViewModel)

    fun inject(playersViewModel: PlayersViewModel)

    fun inject(tournamentListFragmentViewModel: TournamentListFragmentViewModel)


}