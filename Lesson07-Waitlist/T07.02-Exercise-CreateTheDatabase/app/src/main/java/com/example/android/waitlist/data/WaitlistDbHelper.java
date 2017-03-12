package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// TODO (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "waitlist.db";
    private static final String DATABASE_VERSION = "1";

    public WaitlistDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_WAITLIST_TABLE = "create "+DATABASE_NAME
                            +"("+ WaitlistContract.WaitlistEntry._ID+","
                            +"INTEGER PRIMARY KEY AUTOINCREMENT,"+
                            WaitlistContract.WaitlistEntry.COLUMN_GUEST_NAME +" TEXT NOT NULL, "+
                            WaitlistContract.WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER NOT NULL "+
                            WaitlistContract.WaitlistEntry.COLUMN_TIMESTAMP  + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP";
                            ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


        // TODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // TODO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // TODO (8) Override the onUpgrade method

        // TODO (9) Inside, execute a drop table query, and then call onCreate to re-create it

}