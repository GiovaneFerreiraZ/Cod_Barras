package com.example.leitor_codigo_de_barras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        startActivityForResult(intent,0);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        if(requestCode == 0)
        {
            edCoodigo.setText(intent.getStringExtra("SCAN_RESULT"));
        }
    }
}
