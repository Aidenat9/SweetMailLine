package com.tianmu.sweetmailline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "创建一个信封边线的view实例", Toast.LENGTH_SHORT).show();
    }
}
