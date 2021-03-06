package com.example.com.dchat.activities;

import android.os.Bundle;

import com.example.com.dchat.R;
import com.example.com.dchat.views.MainNavDrawer;

public class MainActivity extends BaseAuthenticatedActivity {

    @Override
    protected void onDChatCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Inbox");
        setNavDrawer(new MainNavDrawer(this));
    }

}
