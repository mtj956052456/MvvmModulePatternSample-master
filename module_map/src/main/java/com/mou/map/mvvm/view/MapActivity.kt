package com.mou.map.mvvm.view

import com.alibaba.android.arouter.facade.annotation.Route
import com.fortunes.commonsdk.core.RouterConstants
import com.mou.basemvvm.base.BaseActivity
import com.mou.map.R
import com.mou.map.databinding.MapActivityMapBinding
import com.mou.map.mvvm.vm.MapViewModel

/**
 *  创建者: lenovo
 *  时间: 2020/3/9
 *  描述:
 */
@Route(path = RouterConstants.MAP_ACTIVITY)
class MapActivity : BaseActivity<MapActivityMapBinding>() {

    private val mViewModule by lazy {
        createVM<MapViewModel>()
    }

    override fun getLayoutId() = R.layout.map_activity_map

    override fun initView() {
    }

    override fun initData() {
    }

}