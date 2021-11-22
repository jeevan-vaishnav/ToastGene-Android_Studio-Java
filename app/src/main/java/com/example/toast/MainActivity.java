package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToastShow(View view){
        CharSequence text = "This is toast";
        int duration = Toast.LENGTH_LONG;
        Toast Toastshow = Toast.makeText(this,text,duration);
        Toastshow.show();
    }
}