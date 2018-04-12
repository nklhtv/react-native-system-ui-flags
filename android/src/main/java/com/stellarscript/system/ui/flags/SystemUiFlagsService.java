package com.stellarscript.system.ui.flags;

import android.app.Activity;
import android.support.v4.view.ViewCompat;

public final class SystemUiFlagsService {

    private SystemUiFlagsService() {
    }

    public static void setSystemUiFlags(final Activity activity, final int flags) {
        activity.getWindow().getDecorView().setSystemUiVisibility(flags);
        ViewCompat.requestApplyInsets(activity.getWindow().getDecorView());
    }

    public static int getSystemUiFlags(final Activity activity) {
        return activity.getWindow().getDecorView().getSystemUiVisibility();
    }

}
