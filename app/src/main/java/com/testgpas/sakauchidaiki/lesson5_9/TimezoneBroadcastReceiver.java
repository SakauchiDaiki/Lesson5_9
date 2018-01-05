package com.testgpas.sakauchidaiki.lesson5_9;

/**
 * Created by sakauchidaiki on 2018/01/02.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TimezoneBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "タイムゾーンが変化しました", Toast.LENGTH_LONG).show();
    }
}