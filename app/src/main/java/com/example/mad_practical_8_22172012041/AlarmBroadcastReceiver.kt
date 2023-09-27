package com.example.mad_practical_8_22172012041

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object
    {
        val ALARMKEY = "KEY"
        val ALARMSTART = "START"
        val ALARMSTOP = "STOP"
    }
    override fun onReceive(context: Context, intent: Intent) {

        val data = intent.getStringExtra(ALARMKEY)
        val  intentservice = Intent(context,AlarmService::class.java)
        if(data== ALARMSTART)
        {
            context.startService(intentservice)
        }
        else{
        }
    }
}

