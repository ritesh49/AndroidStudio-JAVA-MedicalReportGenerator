package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Arrays;

public class uaActivity extends AppCompatActivity {

    EditText e1;
    String[] uaReports=new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ua);
        getSupportActionBar().setTitle("URIC ACID DETAILS");


        Intent intent =getIntent();
        String[] trial=intent.getStringArrayExtra("uriName");
        uaReports= Arrays.copyOf(trial,trial.length+2);
    }
    public void uaReport(View view)
    {

        e1=findViewById(R.id.totalUric);

        uaReports[4]=e1.getText().toString().trim();

        Intent intent=new Intent(this,uaReportActivity.class);
        intent.putExtra("uaReports",uaReports);
        startActivity(intent);
    }
}
