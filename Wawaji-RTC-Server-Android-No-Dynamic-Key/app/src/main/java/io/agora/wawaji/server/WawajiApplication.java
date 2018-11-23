package io.agora.wawaji.server;

import android.app.Application;

import io.agora.wawaji.utils.WawajiSetting;

/**
 * Created by yt on 2017/12/15/015.
 */

public class WawajiApplication extends Application {

    private static WawajiApplication mInstance;

    public static WawajiApplication the() {
        return mInstance;
    }

    public WawajiApplication() {
        mInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getSetting(String key) {
        return WawajiSetting.the(mInstance).getSetting(key, null);
    }

    public String getSetting(String key, String defaultValue) {
        return WawajiSetting.the(mInstance).getSetting(key, defaultValue);
    }

    public boolean getSetting(String key, boolean defaultValue) {
        return WawajiSetting.the(mInstance).getSetting(key, defaultValue);
    }

    public int getSetting(String key, int defaultValue) {
        return WawajiSetting.the(mInstance).getSetting(key, defaultValue);
    }

    public void setSetting(String key, String value) {
        WawajiSetting.the(mInstance).setSetting(key, value);
    }

    public void setSetting(String key, boolean value) {
        WawajiSetting.the(mInstance).setSetting(key, value);
    }

    public void setSetting(String key, int value) {
        WawajiSetting.the(mInstance).setSetting(key, value);
    }

}
