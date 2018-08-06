package com.akadatsky.fragmentsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        addHeader();
        addContent();
    }

    private void addHeader() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Bundle args = new Bundle();
        args.putString(HeaderFragment.NAME, "Alex Test");
        Fragment fragment = new HeaderFragment();
        fragment.setArguments(args);
        fragmentManager.beginTransaction().add(R.id.headerContainer, fragment, null).commit();
    }

    private void addContent() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = new SettingsEditFragment();
        fragmentManager.beginTransaction().add(R.id.contentContainer, fragment, null).commit();
    }

    public void backClick(View view) {
        finish();
    }
}
