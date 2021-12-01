package com.example.broadcasthomeworkremake

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(val batteryPer:TextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val batteryLevel = intent?.getIntExtra("level" , 0)
        batteryPer.text = if(batteryLevel?:0 > 0) batteryLevel.toString() else "sleep well baby"
    }
}