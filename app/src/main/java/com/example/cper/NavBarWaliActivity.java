package com.example.cper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.cper.databinding.ActivityNavBarWaliBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavBarWaliActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar_wali);
        bottomNavigationView=findViewById(R.id.bottom_nav_bar);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.contests:
                        Toast.makeText(NavBarWaliActivity.this, "Contests", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.blog:
                        Toast.makeText(NavBarWaliActivity.this, "Blog", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile:
                        Toast.makeText(NavBarWaliActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
    }
}