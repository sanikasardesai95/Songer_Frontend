package com.example.recyclerviewkotlin

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.View
import android.widget.Toast
import com.example.mohit.songer_frontend.R
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
//        setSupportActionBar(toolbar)
//        val actionBar = supportActionBar
//        actionBar?.title = "Hello Toolbar"

        val drawerToggle:ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        ){
            override fun onDrawerClosed(view: View){
                super.onDrawerClosed(view)
                //toast("Drawer closed")
            }

            override fun onDrawerOpened(drawerView: View){
                super.onDrawerOpened(drawerView)
                //toast("Drawer opened")
            }
        }
        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        navigation_view.setNavigationItemSelectedListener{
            when (it.itemId){
                R.id.action_cut -> toast("Cut clicked")
                R.id.action_copy -> toast("Copy clicked")
                R.id.action_paste -> toast("Paste clicked")
                R.id.action_new ->{
                    // Multiline action
                    toast("New clicked")
                    drawer_layout.setBackgroundColor(Color.RED)
                }

            }
            // Close the drawer
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }

    }
    private fun Context.toast(message:String){
        Toast.makeText(applicationContext,message, Toast.LENGTH_SHORT).show()
    }
}
