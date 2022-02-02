package com.example.cper

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var codeforcesBtn:ImageButton
    private lateinit var codeChefBtn:ImageButton
    private lateinit var atCoderBtn:ImageButton
    private lateinit var topcoderBtn:ImageButton
    private lateinit var hackerrankBtn:ImageButton
    private lateinit var hackerEarthBtn:ImageButton
    private lateinit var nextBtn:ImageButton
    private lateinit var cfSelected:TextView
    private lateinit var ccSelected:TextView
    private lateinit var atSelected:TextView
    private lateinit var tcSelected:TextView
    private lateinit var hRSelected:TextView
    private lateinit var hESelected:TextView
    private var flag1=false
    private var flag2=false
    private var flag3=false
    private var flag4=false
    private var flag5=false
    private var flag6=false
    private lateinit var userName:EditText

//    var hashMap : HashMap<String, Boolean>
//            = HashMap<String, Boolean> ()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val sharedPreferences=getSharedPreferences("selectedNames",Context.MODE_PRIVATE)

        userName=findViewById(R.id.editTextName)
        codeforcesBtn=findViewById(R.id.cfButton)
        codeChefBtn=findViewById(R.id.ccButton)
        atCoderBtn=findViewById(R.id.atButton)
        hackerEarthBtn=findViewById(R.id.hEButton)
        hackerrankBtn=findViewById(R.id.hRButton)
        topcoderBtn=findViewById(R.id.tcButton)
        nextBtn=findViewById(R.id.nextButton)
        cfSelected=findViewById(R.id.selected1)
        ccSelected=findViewById(R.id.selected2)
        atSelected=findViewById(R.id.selected3)
        tcSelected=findViewById(R.id.selected4)
        hRSelected=findViewById(R.id.selected5)
        hESelected=findViewById(R.id.selected6)


        codeforcesBtn.setOnClickListener {
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
        codeChefBtn.setOnClickListener {
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
        atCoderBtn.setOnClickListener {
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
        topcoderBtn.setOnClickListener {
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
        hackerrankBtn.setOnClickListener {
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
        hackerEarthBtn.setOnClickListener {
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
                intent.putExtra("userName",userName.text.toString())
            }
            startActivity(intent)
        }

    }


}