package com.mou.map.di.module

import android.app.Application
import com.fortunes.commonsdk.network.HttpUrlConstants
import com.fortunes.commonsdk.network.provider.BaseNetProvider
import com.mou.basemvvm.helper.network.NetMgr
import com.mou.map.mvvm.model.repository.ApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
@Module(includes = [
    ActivityModule::class,
    FragmentModule::class,
    ViewModelModule::class
])
class AppModule {
    @Provides
    @Singleton
    fun provideService(application: Application) = NetMgr.getRetrofit(HttpUrlConstants.getBaseUrl(), BaseNetProvider(application)).create(
            ApiService::class.java
    )
}