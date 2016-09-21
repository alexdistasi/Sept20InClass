package com.example.alex.inclasssept19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



//life cycle
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText mEditText;
    private EditText secondText;
    //private boolean changed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.myTextView);
        mEditText = (EditText) findViewById(R.id.editText1);
        secondText = (EditText) findViewById(R.id.editText);

        mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean hasFocus) {
                //String strVal = mEditText.getText().toString();
                textView.setText(mEditText.getText());
            }
        });

    }

    public void changeTextView(View view){

        textView.setTextSize(100);

    }








}
