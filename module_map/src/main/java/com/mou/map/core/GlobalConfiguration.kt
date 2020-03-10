package com.mou.map.core

import android.app.Application
import android.content.Context
import android.support.v4.app.FragmentManager
import com.mou.basemvvm.integration.AppLifeCycles
import com.mou.basemvvm.integration.ConfigModule

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
class GlobalConfiguration : ConfigModule {

    override fun injectAppLifecycle(context: Context, lifeCycles: MutableList<AppLifeCycles>) {
    }

    override fun injectActivityLifecycle(context: Context, lifeCycles: MutableList<Application.ActivityLifecycleCallbacks>) {
    }

    override fun injectFragmentLifecycle(context: Context, lifeCycles: MutableList<FragmentManager.FragmentLifecycleCallbacks>) {
    }

}