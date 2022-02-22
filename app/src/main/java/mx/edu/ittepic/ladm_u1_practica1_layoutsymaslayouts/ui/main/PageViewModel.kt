package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Esta es la pestaña $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}