package com.example.ankit.hope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ankit on 11-03-2017.
 */

public class newlogin extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlogin);
    }
    public void goto_location(View view){
        Intent intent=new Intent(this,location.class);
        startActivity(intent);
    }
}
