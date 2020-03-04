package com.example.dagger2example;

import android.app.Application;

import com.example.dagger2example.dagger.AppComponent;
import com.example.dagger2example.dagger.DaggerAppComponent;
import com.example.dagger2example.dagger.DriverModule;

public class App extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("KODAK"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
