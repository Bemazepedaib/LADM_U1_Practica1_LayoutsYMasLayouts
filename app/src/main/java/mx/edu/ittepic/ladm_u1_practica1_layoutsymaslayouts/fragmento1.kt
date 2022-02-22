package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.R
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.FragmentMainBinding

class fragmento1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragmento1, container, false)
    }
}
