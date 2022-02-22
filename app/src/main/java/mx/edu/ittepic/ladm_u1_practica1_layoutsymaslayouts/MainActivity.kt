package mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import android.os.Bundle
import android.service.autofill.OnClickAction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.ui.main.SectionsPagerAdapter
import mx.edu.ittepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab
        val fab2 : FloatingActionButton = binding.fab2
        fab.setOnClickListener { llamarSegundoActivity() }
        fab2.setOnClickListener { llamarTercerActivity() }

    }



    private fun llamarSegundoActivity() {
        val otraVentana = Intent(this, MapsActivity::class.java)
        startActivity(otraVentana)
    }
    private fun llamarTercerActivity() {
        val otraVentana = Intent(this, Credencial::class.java)
        startActivity(otraVentana)
    }
}