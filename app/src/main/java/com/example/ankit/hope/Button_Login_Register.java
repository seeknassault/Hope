package com.example.ankit.hope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Button_Login_Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_login_register);
    }
    public void goto_newlogin(View view1){
        Intent intent1=new Intent(this,newlogin.class);
        startActivity(intent1);
    }
    public void goto_newregister(View view){
        Intent intent2=new Intent(this,newregister.class);
        startActivity(intent2);
    }
}
