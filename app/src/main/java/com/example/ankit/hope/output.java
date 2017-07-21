package com.example.ankit.hope;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class output extends AppCompatActivity {
   /* TextView t1=(TextView)findViewById(R.id.textView9);*/
    String passedVar=null;
    private TextView passedView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
     /*   Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            ;
        }*/
        passedVar=getIntent().getStringExtra(Scrolling.ID_EXTRA);
        passedView=(TextView)findViewById(R.id.textView9);
        passedView.setText("You Clicked"+passedVar);

    }
}
