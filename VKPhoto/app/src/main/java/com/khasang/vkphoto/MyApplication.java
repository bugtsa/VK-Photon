package com.khasang.vkphoto;

import android.app.Application;
import android.preference.PreferenceManager;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKAccessTokenTracker;
import com.vk.sdk.VKSdk;

import org.greenrobot.eventbus.EventBus;


public class MyApplication extends Application {
    VKAccessTokenTracker vkAccessTokenTracker = new VKAccessTokenTracker() {
        @Override
        public void onVKAccessTokenChanged(VKAccessToken oldToken, VKAccessToken newToken) {
            if (newToken == null) {
// VKAccessToken is invalid
            }
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().logNoSubscriberMessages(false)
                .sendNoSubscriberEvent(false).installDefaultEventBus();
        vkAccessTokenTracker.startTracking();
        VKSdk.initialize(getApplicationContext());
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    }
}
