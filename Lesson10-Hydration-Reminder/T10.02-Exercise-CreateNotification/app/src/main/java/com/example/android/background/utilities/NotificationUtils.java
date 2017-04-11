package com.example.android.background.utilities;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

import com.example.android.background.MainActivity;
import com.example.android.background.R;

/**
 * Utility class for creating hydration notifications
 */
public class NotificationUtils {



        public void remindUserBecauseCharging(Context context) {
            long[] v = {500,1000};
            int priority = 0;
            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
                // Do something for lollipop and above versions
                priority = NotificationCompat.PRIORITY_HIGH;
            }
            else {
                priority = NotificationCompat.PRIORITY_DEFAULT;
            }

            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(context)
                            .setSmallIcon(R.drawable.ic_drink_notification)
                            .setVibrate(v)
                            .setPriority(priority)
                            .setContentIntent(contentIntent(context))
                            .setContentTitle(context.getString(R.string.charging_reminder_notification_title))
                            .setContentText(context.getString(R.string.charging_reminder_notification_body));
            NotificationManager manager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(1,mBuilder.build());

            //   contentIntent(context)

        }
        public PendingIntent contentIntent(Context context) {
            Intent resultIntent = new Intent(context, MainActivity.class);
            PendingIntent resultPendingIntent =
                  PendingIntent.getActivity(
                            context,
                            0,
                            resultIntent,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
            return resultPendingIntent;
        }

     Bitmap largeIcon(Context context) {
         Bitmap icon = BitmapFactory.decodeResource(context.getResources(),
                 R.drawable.ic_local_drink_black_24px);
         return icon;

     }
}
