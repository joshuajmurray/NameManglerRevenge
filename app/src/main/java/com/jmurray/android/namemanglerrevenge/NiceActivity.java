package com.jmurray.android.namemanglerrevenge;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nice);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);

        Bundle bundle = new Bundle();
        bundle.putString("firstName", firstName);
        bundle.putBoolean("isNice", true);

        if (fragment == null) {
            fragment = new MangleFragment();
            fragment.setArguments(bundle);
            manager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}