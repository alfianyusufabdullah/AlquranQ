package com.alfianyusufabdullah.alquranq.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jonesrandom on 2/21/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper helper;

    public static void initDatabase(Context context) {
        if (helper == null) {
            helper = new DatabaseHelper(context);
        }
    }

    public static SQLiteDatabase getDatabase() {
        return helper.getWritableDatabase();
    }

    private DatabaseHelper(Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatabaseContract.TableSurah.CREATE_TABLE);
        db.execSQL(DatabaseContract.TableAyat.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
