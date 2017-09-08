package com.eslimaf.finlifehack.dashboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.eslimaf.finlifehack.R
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        fabAddAction.setOnClickListener{
            Log.d("FAB","Clicked")
        }
    }
}
