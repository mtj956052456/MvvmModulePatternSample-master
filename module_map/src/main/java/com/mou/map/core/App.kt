package com.mou.map.core

import com.mou.basemvvm.base.BaseApplication
import com.mou.map.di.component.DaggerAppComponent

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
class App : BaseApplication() {

    override fun injectComponent() {
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

}