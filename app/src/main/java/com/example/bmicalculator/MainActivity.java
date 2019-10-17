package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public EditText weight = null, height = null, display = null;
    public float wt = 0, ht = 0, result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        weight = findViewById( R.id.editText );
        height = findViewById( R.id.editText2 );
        display = findViewById( R.id.editText3 );

    }


    public void onClick(View v) {
        LinearLayout curr = (LinearLayout) findViewById( R.id.main );
        wt = Float.parseFloat( weight.getText().toString() );
        ht = Float.parseFloat( height.getText().toString() );

        result = wt / (ht * ht);

        if(result<18) {
            display.setText("BMI = " + String.valueOf( result ) + "\n\nYou are underweight");
            curr.setBackgroundColor( Color.YELLOW );
        }
        else if(result>=18 && result<=25) {
            display.setText( "BMI = " + String.valueOf( result ) + "\n\nYou are fit" );
            curr.setBackgroundColor( Color.GREEN );
        }
        else if(result>25){
            display.setText("BMI = " + String.valueOf( result ) + "\n\nYou are obese");
            curr.setBackgroundColor( Color.RED );
        }
    }
}

