package com.example.naco.bai108broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by nguye on 10-Nov-17.
 */

public class SMSReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        StringBuilder allMessage = new StringBuilder();
        if(bundle != null){
            Object[] pdus = (Object[]) bundle.get("pdus");
            for(int i = 0; i < pdus.length; i++){
                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdus[i]);
                allMessage.append("\nFrom: " + smsMessage.getDisplayOriginatingAddress());
                allMessage.append("\nMessage: " + smsMessage.getDisplayMessageBody());
            }
            Toast.makeText(context, allMessage.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}
