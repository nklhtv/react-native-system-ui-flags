import { NativeModules } from 'react-native';

const SystemUiFlags = NativeModules.SystemUiFlags;

const CONSTANTS = {
    SYSTEM_UI_FLAG_HIDE_NAVIGATION: SystemUiFlags.SYSTEM_UI_FLAG_HIDE_NAVIGATION,
    SYSTEM_UI_FLAG_FULLSCREEN: SystemUiFlags.SYSTEM_UI_FLAG_FULLSCREEN,
    SYSTEM_UI_FLAG_LAYOUT_STABLE: SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_STABLE,
    SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION: SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION,
    SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN: SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN,
    SYSTEM_UI_FLAG_LOW_PROFILE: SystemUiFlags.SYSTEM_UI_FLAG_LOW_PROFILE,
    SYSTEM_UI_FLAG_VISIBLE: SystemUiFlags.SYSTEM_UI_FLAG_VISIBLE,
    SYSTEM_UI_FLAG_LIGHT_STATUS_BAR: SystemUiFlags.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR,
    SYSTEM_UI_FLAG_IMMERSIVE_STICKY: SystemUiFlags.SYSTEM_UI_FLAG_IMMERSIVE_STICKY,
    SYSTEM_UI_FLAG_IMMERSIVE: SystemUiFlags.SYSTEM_UI_FLAG_IMMERSIVE
};

const setSystemUiFlags = (flags) => {
    if (typeof flags !== 'number' || isNaN(flags)) {
        console.warn('setSystemUiFlags called with invalid parameters', flags);
        return;
    }

    SystemUiFlags.setSystemUiFlags(flags);
};

const updateSystemUiFlags = (flags) => {
    if (typeof flags !== 'number' || isNaN(flags)) {
        console.warn('updateSystemUiFlags called with invalid parameters', flags);
        return;
    }

    SystemUiFlags.updateSystemUiFlags(flags);
};

const getSystemUiFlags = (callback) => {
    return new Promise((resolve) => {
        SystemUiFlags.getSystemUiFlags((flags) => {
            resolve(flags);
            if (typeof callback === 'function') {
                callback(flags);
            }
        });
    });
};

export default {
    getSystemUiFlags,
    setSystemUiFlags,
    updateSystemUiFlags,
    ...CONSTANTS
};
