const CONSTANTS = {
    SYSTEM_UI_FLAG_HIDE_NAVIGATION: 0,
    SYSTEM_UI_FLAG_FULLSCREEN: 0,
    SYSTEM_UI_FLAG_LAYOUT_STABLE: 0,
    SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION: 0,
    SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN: 0,
    SYSTEM_UI_FLAG_LOW_PROFILE: 0,
    SYSTEM_UI_FLAG_VISIBLE: 0,
    SYSTEM_UI_FLAG_LIGHT_STATUS_BAR: 0,
    SYSTEM_UI_FLAG_IMMERSIVE_STICKY: 0,
    SYSTEM_UI_FLAG_IMMERSIVE: 0
};

const setSystemUiFlags = (flags) => {
    if (typeof flags !== 'number' || isNaN(flags)) {
        console.warn('setSystemUiFlags called with invalid parameters', flags);
        return;
    }
};

const updateSystemUiFlags = (flags) => {
    if (typeof flags !== 'number' || isNaN(flags)) {
        console.warn('updateSystemUiFlags called with invalid parameters', flags);
        return;
    }
};

const getSystemUiFlags = (callback) => {
    return new Promise((resolve) => {
        resolve(0);
        if (typeof callback === 'function') {
            callback(0);
        }
    });
};

export default {
    getSystemUiFlags,
    setSystemUiFlags,
    updateSystemUiFlags,
    ...CONSTANTS
};
