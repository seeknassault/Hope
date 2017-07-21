package com.example.ankit.hope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class upload_or_access extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_or_access);
    }
    public void goto_uploading(View view){
        Intent intent= new Intent(this,Accused_info1.class);
        startActivity(intent);
    }
    public void goto_accessing(View view){
        Intent intent= new Intent(this,cities.class);
        startActivity(intent);
    }
}
