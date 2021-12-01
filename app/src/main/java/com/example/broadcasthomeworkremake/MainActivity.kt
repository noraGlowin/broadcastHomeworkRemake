package com.example.broadcasthomeworkremake

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   lateinit var MyBatteryReceiver: MyReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val batteryText :TextView=findViewById(R.id.battery)
        MyBatteryReceiver = MyReceiver(batteryText)
        registerReceiver(MyBatteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(MyBatteryReceiver)
    }
}