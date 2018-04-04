package com.example.student.myapplication;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.searchImageView:
            case R.id.searchTextView:
                startActivity(new Intent(MainActivity.this, SearchActivity.class));
                break;
            case R.id.truckImageView:
            case R.id.truckTextView:
                startActivity(new Intent(MainActivity.this, TruckUpdateActivity.class));
                break;
        }


    }
}
