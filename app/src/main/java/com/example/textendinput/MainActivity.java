package com.example.textendinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ivDeleteMsg = findViewById(R.id.btn_delete_info);
        EditText edtPhone = findViewById(R.id.edt_house_msg);
        EditTextUtils.clearButtonListener(edtPhone, ivDeleteMsg);
     }
}
