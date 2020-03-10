package com.mou.map.di.module

import com.mou.map.mvvm.view.MapActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMapActivity(): MapActivity

}