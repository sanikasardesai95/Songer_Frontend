package com.example.mohit.songer_frontend

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.recyclerviewkotlin.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
// verifyAvailableNetwork()
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter
    }
  //  fun verifyAvailableNetwork(activity:AppCompatActivity):Boolean{
//        val connectivityManager=activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val networkInfo=connectivityManager.activeNetworkInfo
//        return  networkInfo!=null && networkInfo.isConnected
//    }
}
