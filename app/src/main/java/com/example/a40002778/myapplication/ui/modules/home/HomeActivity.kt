package com.example.a40002778.myapplication.ui.modules.home

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.example.a40002778.myapplication.R
import com.example.a40002778.myapplication.ui.modules.clans.ClanListFragment
import com.example.a40002778.myapplication.ui.modules.dashboard.DashboardFragment
import com.example.a40002778.myapplication.ui.modules.settings.SettingsFragment
import jp.wasabeef.util.ext.addOrReplaceFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_dashboard -> {
                addOrReplaceFragment(R.id.home_container, ::DashboardFragment)
                return true
            }

            R.id.navigation_clans -> {
                addOrReplaceFragment(R.id.home_container, ::ClanListFragment)
                return true
            }

            R.id.navigation_settings -> {
                addOrReplaceFragment(R.id.home_container, ::SettingsFragment)
                return true
            }

            else -> throw IllegalStateException("Not founded this ID")
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        home_bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

}
