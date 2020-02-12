package com.kidzania.afflesplitify.utility;

import android.content.Context;
import android.provider.Settings;
import android.widget.Toast;

public class Utility {

    public static String getDeviceId(Context context) {
        String deviceId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        return deviceId;
    }

    private void isInternetConnected(Context mContext) {

    }

}
