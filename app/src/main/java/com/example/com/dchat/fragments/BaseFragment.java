package com.example.com.dchat.fragments;

import android.os.Bundle;
import android.app.Fragment;

import com.example.com.dchat.infrastructure.DChatApplication;
import com.squareup.otto.Bus;

public abstract class BaseFragment extends Fragment {
    protected DChatApplication application;
    protected Bus bus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (DChatApplication) getActivity().getApplication();
        bus = application.getBus();

        bus.register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}
