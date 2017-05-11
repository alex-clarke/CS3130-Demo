package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button b;
    EditText editText;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        editText= (EditText) findViewById(R.id.edittext);
        text = (TextView) findViewById(R.id.helloText);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                text.setText(editText.getText().toString());
            }
        });

    }
}
