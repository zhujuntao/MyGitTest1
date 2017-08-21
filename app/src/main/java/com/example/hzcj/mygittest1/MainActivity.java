package com.example.hzcj.mygittest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        Log.d("tag","功能1");
    }
    /**
     * feature-2
     * display HelloWorld
     * @param view
     */
    public void feature2(View view) {
        Log.d("tag","功能2");
    }
    /**
     * feature-2
     * display HelloWorld
     * @param view
     */
    public void feature3(View view) {
        Log.d("tag","功能3");
    }

}
