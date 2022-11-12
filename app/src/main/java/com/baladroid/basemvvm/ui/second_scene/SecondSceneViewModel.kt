package com.baladroid.basemvvm.ui.second_scene

import com.baladroid.basemvvm.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondSceneViewModel @Inject constructor() : BaseViewModel() {

    fun goBackClicked() {
        navigateBack()
    }
}