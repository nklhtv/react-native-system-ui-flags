package com.stellarscript.system.ui.flags;

import android.app.Activity;
import android.os.Build;
import android.view.View;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;

import java.util.Map;

public class SystemUiFlagsModule extends ReactContextBaseJavaModule {

    private static final String TAG = "SystemUiFlags";

    public SystemUiFlagsModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return TAG;
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = MapBuilder.newHashMap();

        constants.put("SYSTEM_UI_FLAG_HIDE_NAVIGATION", View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        constants.put("SYSTEM_UI_FLAG_FULLSCREEN", View.SYSTEM_UI_FLAG_FULLSCREEN);
        constants.put("SYSTEM_UI_FLAG_LAYOUT_STABLE", View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        constants.put("SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION", View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        constants.put("SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN", View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        constants.put("SYSTEM_UI_FLAG_LOW_PROFILE", View.SYSTEM_UI_FLAG_LOW_PROFILE);
        constants.put("SYSTEM_UI_FLAG_VISIBLE", View.SYSTEM_UI_FLAG_VISIBLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            constants.put("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR", View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        } else {
            constants.put("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR", 0);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            constants.put("SYSTEM_UI_FLAG_IMMERSIVE_STICKY", View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
            constants.put("SYSTEM_UI_FLAG_IMMERSIVE", View.SYSTEM_UI_FLAG_IMMERSIVE);
        } else {
            constants.put("SYSTEM_UI_FLAG_IMMERSIVE_STICKY", 0);
            constants.put("SYSTEM_UI_FLAG_IMMERSIVE", 0);
        }

        return constants;
    }

    @ReactMethod
    public void getCurrentSystemUiFlags(final Callback cb) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    int currentSystemUiFlags = currentActivity.getWindow().getDecorView().getSystemUiVisibility();
                    cb.invoke(currentSystemUiFlags);
                }
            }
        });
    }

    @ReactMethod
    public void setSystemUiFlags(final int systemUiFlags) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    currentActivity.getWindow().getDecorView().setSystemUiVisibility(systemUiFlags);
                }
            }
        });
    }

    @ReactMethod
    public void updateSystemUiFlags(final int systemUiFlags) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    int currentSystemUiFlags = currentActivity.getWindow().getDecorView().getSystemUiVisibility();
                    int newSystemUiFlags = currentSystemUiFlags | systemUiFlags;
                    currentActivity.getWindow().getDecorView().setSystemUiVisibility(newSystemUiFlags);
                }
            }
        });
    }

}
