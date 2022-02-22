package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.Fragmento2Binding

class fragmento2 : Fragment() {

    private var _binding: Fragmento2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento2, container, false)
    }

}
