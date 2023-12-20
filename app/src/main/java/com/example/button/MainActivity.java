package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText=findViewById(R.id.editText);
        Button myButton=findViewById(R.id.mybutton);
        final TextView displayText=findViewById(R.id.displayText);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText=findViewById(R.id.editText);
                String inputText=editText.getText().toString();

                if(!inputText.isEmpty())
                {
                    displayText.setText("Hello " + inputText + "!");
                }
                else {
                    displayText.setText("Please Enter your name!");
                }
            }
        });
    }
}