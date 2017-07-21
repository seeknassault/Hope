package com.example.ankit.hope;

/**
 * Created by ankit on 26-03-2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<String> getQuotes() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM Hope", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add("\nName ::"+cursor.getString(0)+"\n\nAge ::"+cursor.getString(1)+/*"\n\n Image ::"+cursor.getBlob(2)+*/"\n\nLocality ::"+cursor.getString(3)+/*+"\n\n What Happened ::"+cursor.getString(8)+"\n\nCrime ::"+cursor.getString(4)+"\n\nPunishment ::"+cursor.getString(5)+"\n\nStatus ::"+cursor.getString(6)+"\n\nVictim's Call ::"+cursor.getString(7)+*/"\n");
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
}