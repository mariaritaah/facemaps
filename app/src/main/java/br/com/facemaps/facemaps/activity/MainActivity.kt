package br.com.facemaps.facemaps.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Gravity
import android.view.MenuItem
import br.com.facemaps.facemaps.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import org.jetbrains.anko.toast

class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        setupNavDrawer()
        am_fab.setOnClickListener {
            toast("Publicar Post!")
        }
    }

    private fun setupNavDrawer() {
        val toggle = ActionBarDrawerToggle(this, am_drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        am_drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        am_nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.ndm_about -> {
                toast("Você clicou em Sobre!")
            }
            R.id.ndm_manage -> {
                toast("Você clicou em Configurações!")
            }
        }

        am_drawer_layout.closeDrawer(GravityCompat.START)
        return true

    }

}
