package com.example.nt910s5k_k71g.thinketch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReglsterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglster);


        EditText idText = (EditText) findViewById(R.id.idText);
        EditText pwText = (EditText) findViewById(R.id.pwText);
        EditText  nameText = (EditText) findViewById(R.id.nameText);
        Button regbutton = (Button) findViewById(R.id.regbutton);
        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancleIntent = new Intent(ReglsterActivity.this, MainActivity.class);
                ReglsterActivity.this.startActivity(cancleIntent);
            }
        });

    }
}