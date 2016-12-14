package com.example.seedcommando_7.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       b=(Button)findViewById(R.id.button);

    }
    public void show1(View v)
    {
        Toast.makeText(this,"Rashmi",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Rashmi",Toast.LENGTH_LONG).show();
    }
}
