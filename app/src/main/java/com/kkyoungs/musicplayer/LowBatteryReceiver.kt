package com.kkyoungs.musicplayer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class LowBatteryReceiver :BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        when(p1?.action){
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(p0, "배터리가 부족합니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}