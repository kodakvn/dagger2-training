package com.example.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
	private static final String TAG = "kkk";

	@Inject
	public Remote() {
	}

	public void setListener(Car car) {
		Log.d(TAG, "remote connected");
	}
}
