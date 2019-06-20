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

const setSystemUiFlags = () => {
};

const updateSystemUiFlags = () => {
};

const getSystemUiFlags = () => {
    return Promise.resolve(0);
};

export default {
    getSystemUiFlags,
    setSystemUiFlags,
    updateSystemUiFlags,
    ...CONSTANTS
};
