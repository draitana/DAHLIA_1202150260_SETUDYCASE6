package com.example.a3d.dahlia_1202150260_modul6;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by virra PC on 3/30/2018.
 */

public class FireApp extends Application {

    //Menghubungkan Firebase
    @Override
    public void onCreate() {
        super.onCreate();

        if(!FirebaseApp.getApps(this).isEmpty())
        {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
