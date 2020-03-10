package com.mou.map.di.component

import android.app.Application
import com.mou.basemvvm.android.FactoryModule
import com.mou.map.core.App
import com.mou.map.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    FactoryModule::class,
    AppModule::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(application: App) {

    }

}