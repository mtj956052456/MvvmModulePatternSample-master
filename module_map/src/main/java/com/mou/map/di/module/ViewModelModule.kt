package com.mou.map.di.module

import android.arch.lifecycle.ViewModel
import com.mou.basemvvm.android.ViewModelKey
import com.mou.map.mvvm.vm.MapViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MapViewModel::class)
    abstract fun bindMapViewModel(viewModel: MapViewModel): ViewModel

}