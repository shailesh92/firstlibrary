package com.firstlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class LibraryActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        init1();
    }


    public void init1(){
        Toast.makeText(getApplicationContext(), "Call library @@@@@@@@", Toast.LENGTH_SHORT).show();
      //  startActivity(new Intent(LibraryActivity.this,AnotherTestLibActivity.class));
        Log.e("THis is lub","THis is lub");

      //  Intent intent = new Intent();
     //   intent.setClassName(getApplicationContext().getPackageName(), "AnotherTestLibActivity.class");
     //   startActivity(intent);
    }
}
