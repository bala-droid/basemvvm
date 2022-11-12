package com.baladroid.basemvvm.ui.first_scene

import com.baladroid.basemvvm.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstSceneViewModel @Inject constructor() : BaseViewModel() {

    fun goToSecondFragmentClicked() {
        navigate(FirstSceneFragmentDirections.actionFirstSceneFragmentToSecondSceneFragment(""))
    }

    fun goToSecondFragmentWithArgs() {
        navigate(
            FirstSceneFragmentDirections.actionFirstSceneFragmentToSecondSceneFragment(
                "Test user id"
            )
        )
    }
}