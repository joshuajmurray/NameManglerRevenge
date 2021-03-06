package com.jmurray.android.namemanglerrevenge;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mNiceButton;
    private Button mRudeButton;
    private EditText mFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstName = (EditText) findViewById(R.id.first_name);

        mNiceButton = (Button) findViewById(R.id.mangle_nice);
        mNiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mFirstName.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, R.string.no_first_name, Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Intent intent = new Intent(MainActivity.this, NiceActivity.class);
                    intent.putExtra("firstName", mFirstName.getText().toString());
                    mFirstName.setText("");
                    startActivity(intent);
                }
            }
        });

        mRudeButton = (Button)findViewById(R.id.mangle_rude);
        mRudeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mFirstName.getText().toString().matches("")) {
                    Toast.makeText(MainActivity.this, R.string.no_first_name, Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Intent intent = new Intent(MainActivity.this, NiceActivity.class);//change to rudeActivity
                    intent.putExtra("firstName", mFirstName.getText().toString());
                    mFirstName.setText("");
                    startActivity(intent);
                }
            }
        });

    }

}
