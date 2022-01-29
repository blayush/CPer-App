package com.example.cper

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var recView: RecyclerView
    var url = "https://kontests.net/api/v1/codeforces"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        // add dialog box soon for details of the platform

//        recView.findViewById<RecyclerView>(R.id.recyclerView)
//        recView.layoutManager = LinearLayoutManager(this)
//        var requestQueue = Volley.newRequestQueue(this)
//        val stringRequest =
//            StringRequest(Request.Method.GET, url, Response.Listener<String> { response ->
//                var gsonBuilder: GsonBuilder
//                var gson: Gson
//                RecyclerViewDatum[] data = gson . fromJson (response, RecyclerViewDatum.class)
//
//            }, Response.ErrorListener { Toast.makeText(this, "Error", LENGTH_LONG) })
//        requestQueue.add(stringRequest)
    }
}