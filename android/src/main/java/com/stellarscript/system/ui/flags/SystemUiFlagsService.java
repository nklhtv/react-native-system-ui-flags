package com.stellarscript.system.ui.flags;

import android.app.Activity;

public final class SystemUiFlagsService {

    private SystemUiFlagsService() {
    }

    public static void setSystemUiFlags(final Activity activity, final int flags) {
        activity.getWindow().getDecorView().setSystemUiVisibility(flags);
    }

    public static int getSystemUiFlags(final Activity activity) {
        return activity.getWindow().getDecorView().getSystemUiVisibility();
    }

}
