package com.example.aunyamanee_nook.aunyamanee_restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Aunyamanee_Nook on 19/10/2559.
 */
public class UserTABLE {
        //Explicit
        private MySQLiteOpenHelper objMySQLiteOpenHelper;
        private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;

        public UserTABLE(Context context){
            objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
            writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
            readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
        }//Constructor
    } //Main Class
