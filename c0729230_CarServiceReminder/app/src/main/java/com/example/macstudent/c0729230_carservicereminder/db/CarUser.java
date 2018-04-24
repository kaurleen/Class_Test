package com.example.macstudent.c0729230_carservicereminder.db;


import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by macstudent on 2018-04-13.
 */

public class CarUser extends SQLiteOpenHelper
{





        private static final String DB_NAME  = "carservice";
        private static final int DB_VERSION = 1;

        public CarUser(Context context)
        {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            String userTable = "CREATE TABLE " + DBUser.TABLE_USER
                    + "(" + CarUser.KEY_USER_EMAIL + " TEXT PRIMARY KEY, "
                    + CarUser.KEY_USER_PASSWORD + " TEXT )";

            db.execSQL(userTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
        {
            db.execSQL("DROP TABLE " + CarUser.TABLE_USER);

            onCreate(db);
        }
    }


