package com.nh.system.ui.flags;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class SystemUiFlags extends ReactContextBaseJavaModule {
    public SystemUiFlags(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "SystemUiFlags";
    }
}