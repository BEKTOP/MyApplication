package com.github.a5809909.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = (EditText)this.findViewById(R.id.editText);
    }



    public void runExample(View view)  {
        try {

            Company company = ReadJSONExample.readCompanyJSONFile(this);

            outputText.setText(company.toString());
        } catch(Exception e)  {
            outputText.setText(e.getMessage());
            e.printStackTrace();
        }
    }

}