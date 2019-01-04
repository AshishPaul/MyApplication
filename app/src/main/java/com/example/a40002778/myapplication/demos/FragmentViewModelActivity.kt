package com.example.a40002778.myapplication.demos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a40002778.myapplication.R
import com.example.a40002778.myapplication.ui.fragmentviewmodel.FragmentViewModelFragment

class FragmentViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FragmentViewModelFragment.newInstance())
                .commitNow()
        }
    }

}
