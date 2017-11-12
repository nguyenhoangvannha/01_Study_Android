package com.example.naco.bai110broadcastreceiverincode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by nguye on 12-Nov-17.
 */

public class InternetConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo infoWifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo infoData = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        boolean isWifiConnect = infoWifi.isConnectedOrConnecting();
        boolean isDataConnect = infoData.isConnectedOrConnecting();
        boolean isConnectInternet = isWifiConnect || isDataConnect;
        if(isConnectInternet){
            Toast.makeText(context, "Is connected", Toast.LENGTH_SHORT);
        } else {
            Toast.makeText(context, "Is not connected", Toast.LENGTH_SHORT);
        }
    }
}
