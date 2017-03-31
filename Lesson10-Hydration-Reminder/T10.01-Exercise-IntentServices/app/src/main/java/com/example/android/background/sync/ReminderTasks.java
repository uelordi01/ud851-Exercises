package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks {
    public static String ACTION_INCREMENT_WATER_COUNT = "drink_water";
    public static void executeTask(Context context, String action) {
            if(action.equals(ACTION_INCREMENT_WATER_COUNT)) {
                setActionIncrementWaterCount(context);
            }
    }
    private static void setActionIncrementWaterCount(Context context) {
       // int glassesOfWater =  PreferenceUtilities.getWaterCount(context);
       // glassesOfWater++;
        PreferenceUtilities.incrementWaterCount(context);
    }
}