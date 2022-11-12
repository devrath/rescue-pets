package com.petrescue.modules.animals.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

@HiltViewModel
class AnimalsFragmentViewModel @Inject constructor(
    private val compositeDisposable: CompositeDisposable
): ViewModel() {

}