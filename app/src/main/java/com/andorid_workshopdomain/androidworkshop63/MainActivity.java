package com.andorid_workshopdomain.androidworkshop63;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void createNotification(View v)
    {
        Intent in = new Intent(this,Activity2.class);
        PendingIntent p1 = PendingIntent.getActivity(this,20,in,0);



        Notification noti = new Notification.Builder(this)
                .setContentTitle("New email from xyz@gmail.com")
                .setContentText("subject")
                .setSmallIcon(R.drawable.download)
                .setContentIntent(p1)
                .addAction(R.drawable.download,"Call",p1)
                .addAction(R.drawable.download,"More",p1)
                .addAction(R.drawable.download,"Extra",p1).build();
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        noti.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0,noti);
    }
}
