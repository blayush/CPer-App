package com.example.cper

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
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
    private lateinit var codeforces_btn:ImageButton
    private lateinit var codechef_btn:ImageButton
    private lateinit var atcoder_btn:ImageButton
    private lateinit var topcoder_btn:ImageButton
    private lateinit var hackerRank_btn:ImageButton
    private lateinit var hackerEarth_btn:ImageButton
    private lateinit var nextBtn:ImageButton
    private lateinit var cfSelected:TextView
    private lateinit var ccSelected:TextView
    private lateinit var atSelected:TextView
    private lateinit var tcSelected:TextView
    private lateinit var hRSelected:TextView
    private lateinit var hESelected:TextView
    var flag1=false;
    var flag2=false;
    var flag3=false;
    var flag4=false;
    var flag5=false;
    var flag6=false;

//    var hashMap : HashMap<String, Boolean>
//            = HashMap<String, Boolean> ()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val sharedPreferences=getSharedPreferences("selectedNames",Context.MODE_PRIVATE)

        codeforces_btn=findViewById(R.id.cfButton)
        codechef_btn=findViewById(R.id.ccButton)
        atcoder_btn=findViewById(R.id.atButton)
        hackerEarth_btn=findViewById(R.id.hEButton)
        hackerRank_btn=findViewById(R.id.hRButton)
        topcoder_btn=findViewById(R.id.tcButton)
        nextBtn=findViewById(R.id.nextButton)
        cfSelected=findViewById(R.id.selected1)
        ccSelected=findViewById(R.id.selected2)
        atSelected=findViewById(R.id.selected3)
        tcSelected=findViewById(R.id.selected4)
        hRSelected=findViewById(R.id.selected5)
        hESelected=findViewById(R.id.selected6)


        codeforces_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag1) {
               cfSelected.alpha = 1.0f
               flag1=true
               editor.putString("CodeForces","CodeForces")
                editor.apply()
           }
           else {
               cfSelected.alpha = 0.0f
               flag1=false
                editor.remove("CodeForces").apply()
           }
        }
        codechef_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag2) {
                ccSelected.alpha = 1.0f
                flag2=true
                editor.putString("CodeChef","CodeChef").apply()
            }
            else {
                ccSelected.alpha = 0.0f
                flag2=false
                editor.remove("CodeChef").apply()
            }
        }
        atcoder_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag3) {
                atSelected.alpha = 1.0f
                flag3=true
                editor.putString("AtCoder","AtCoder").apply()
            }
            else {
                atSelected.alpha = 0.0f
                flag3=false
                editor.remove("AtCoder").apply()
            }
        }
        topcoder_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag4) {
                tcSelected.alpha = 1.0f
                flag4=true
                editor.putString("TopCoder","TopCoder").apply()
            }
            else {
                tcSelected.alpha = 0.0f
                flag4=false
                editor.remove("TopCoder").apply()
            }
        }
        hackerRank_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag5) {
                hRSelected.alpha = 1.0f
                flag5=true
                editor.putString("HackerRank","HackerRank").apply()
            }
            else {
                hRSelected.alpha = 0.0f
                flag5=false
                editor.remove("HackerRank").apply()
            }
        }
        hackerEarth_btn.setOnClickListener {
            val editor=sharedPreferences.edit()
            if(!flag6) {
                hESelected.alpha = 1.0f
                flag6=true
                editor.putString("HackerEarth","HackerEarth").apply()
            }
            else {
                hESelected.alpha = 0.0f
                flag6=false
                editor.remove("HackerEarth").apply()
            }
        }
        nextBtn.setOnClickListener {
            val intent = Intent(this, MainActivity_JAVA::class.java).apply {

            }
            startActivity(intent)
        }

    }


}