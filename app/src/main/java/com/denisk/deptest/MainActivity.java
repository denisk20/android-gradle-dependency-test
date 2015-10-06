package com.denisk.deptest;

import android.app.Activity;
import android.os.Bundle;
import com.example.JavaLibClass;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JavaLibClass javaLibClass = new JavaLibClass();
        javaLibClass.javaMethod();

    }
}
