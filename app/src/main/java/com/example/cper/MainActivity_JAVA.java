package com.example.cper;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity_JAVA extends AppCompatActivity {
    private static final String url="https://kontests.net/api/v1/code_forces";
    RecyclerView recyclerView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sharedPreferences=getSharedPreferences("selectedNames", Context.MODE_PRIVATE);
        Log.d("checkNames : ",sharedPreferences.getString("CodeChef", "NO"));
        volleyCall();
    }

    public void volleyCall(){
        StringRequest stringRequest=new StringRequest(url, response -> {
           // Log.d("response : ",response);
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            RecyclerViewDatum []data=gson.fromJson(response,RecyclerViewDatum[].class);
            recyclerView.setAdapter(new MyAdapterJava(data,getApplicationContext()));
        }, error -> Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show());
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    private Boolean checkNames(RecyclerViewDatum data){

        return sharedPreferences.getString(data.getName(), "").equals(data.getName()) ;
    }

}