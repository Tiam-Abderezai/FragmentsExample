package com.example.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity

        implements MasterUserFragment.ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_detail);

        MasterUserFragment fragment = new MasterUserFragment();
        FragmentManager manager = getSupportFragmentManager();

        manager.beginTransaction()
                .add(R.id.frame_layout_master, fragment)
                .commit();
    }

    @Override
    public void itemClicked(CharSequence message, int background) {
        if (findViewById(R.id.frame_layout_detail) == null) {
            Intent intent = DetailUserActivity.newIntent(this, message, background);
            startActivity(intent);
        }
        else {
            DetailUserFragment fragment = DetailUserFragment.newFragment(message, background);
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.frame_layout_detail, fragment)
                    .commit();
        }

    }
}
