package com.example.fragmentsexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class DetailUserActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.example.fragmentsexample.extra.Message";
    private static final String EXTRA_BACKGROUND = "com.example.fragmentsexample.extra.Background";

    public static Intent newIntent (Context parent, CharSequence message, int background) {
        Intent intent = new Intent(parent, DetailUserActivity.class);

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_BACKGROUND, background);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);
Intent intent = getIntent();
CharSequence message = intent.getCharSequenceExtra(EXTRA_MESSAGE);
        int background = intent.getIntExtra(EXTRA_BACKGROUND, 0);

        DetailUserFragment fragment = DetailUserFragment.newFragment(message, background);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.frame_layout_detail, fragment)
                .commit();
    }
}
