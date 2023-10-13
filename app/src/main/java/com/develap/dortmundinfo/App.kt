package com.develap.dortmundinfo

import android.app.Application
import com.develap.dortmundinfo.di.AppComponent
import com.develap.dortmundinfo.di.DaggerAppComponent
import com.develap.dortmundinfo.di.modules.DatabaseModule
import com.develap.dortmundinfo.di.modules.DomainModule
import com.develap.dortmundinfo.di.modules.RemoteProvider

class App : Application() {

    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        dagger = DaggerAppComponent.builder()
            .remoteProvider(RemoteProvider())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }

}
