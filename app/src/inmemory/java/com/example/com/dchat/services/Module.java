package com.example.com.dchat.services;

import android.util.Log;

import com.example.com.dchat.infrastructure.DChatApplication;

public class Module {
    public static void register(DChatApplication application) {
        new InMemoryAccountService(application);
    }
}