package com.diosatriani.notificationpendingintent;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // identititas id unik untuk notification
    public static final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setSubtitle("Belajar Notification");
    }

    public void click(View view) {

        //Menmbangun atau mensetup Notification dengan NotificationCompat.Builder

        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_3d_rotation_black_24dp) //icon notifikasi
                .setContentTitle("N_O_T_I_F_I_K_A_S_I") //judul atau content
                .setAutoCancel(true) //untuk menswipe atau menghapus notification
                .setContentText("Dio Satriani"); //isi pesan

//        Kemudian kita harus menambahkan Notification dengan menggunakan NotificationManager
        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
         notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
