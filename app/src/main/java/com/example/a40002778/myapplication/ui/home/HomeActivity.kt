package com.example.a40002778.myapplication.ui.home

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.example.a40002778.myapplication.R
import com.example.a40002778.myapplication.ui.clans.ClanListFragment
import com.example.a40002778.myapplication.ui.dashboard.DashboardFragment
import com.example.a40002778.myapplication.ui.settings.SettingsFragment
import dagger.android.support.DaggerAppCompatActivity
import jp.wasabeef.util.ext.replaceFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_dashboard -> replaceFragment(R.id.home_container, ::DashboardFragment)

            R.id.navigation_clans -> replaceFragment(R.id.home_container, ::ClanListFragment)

            R.id.navigation_notifications -> replaceFragment(R.id.home_container, ::SettingsFragment)

            else -> throw IllegalStateException("Not founded this ID")
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        home_bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

}
