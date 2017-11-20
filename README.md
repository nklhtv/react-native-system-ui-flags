# react-native-system-ui-flags

### Plugin for changing [system ui visibility](https://developer.android.com/training/system-ui/immersive.html) on Android

```javascript
import SystemUiFlags from 'react-native-system-ui-flags';

const FULL_SCREEN_SYSTEM_UI_FLAGS = 0
        | SystemUiFlags.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | SystemUiFlags.SYSTEM_UI_FLAG_FULLSCREEN
        | SystemUiFlags.SYSTEM_UI_FLAG_IMMERSIVE
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_STABLE
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
        
SystemUiFlags.updateSystemUiFlags(FULL_SCREEN_SYSTEM_UI_FLAGS);

```

```javascript
import SystemUiFlags from 'react-native-system-ui-flags';

const FULL_SCREEN_SYSTEM_UI_FLAGS = 0
        | SystemUiFlags.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | SystemUiFlags.SYSTEM_UI_FLAG_FULLSCREEN
        | SystemUiFlags.SYSTEM_UI_FLAG_IMMERSIVE
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_STABLE
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        | SystemUiFlags.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
        
SystemUiFlags.getSystemUiFlags((flags) => {
  const newFlags = flags | FULL_SCREEN_SYSTEM_UI_FLAGS;
  SystemUiFlags.setSystemUiFlags(newFlags);
});

```
