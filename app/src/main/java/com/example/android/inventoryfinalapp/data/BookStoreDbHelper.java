package com.example.android.inventoryfinalapp.data;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry;

public class BookStoreDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Book.db";
    private static final int DATABASE_VERSION = 1;

    public BookStoreDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create a Table
        String SQL_CREATE_BOOK_TABLE = "CREATE TABLE " + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.TABLE_NAME + " ("
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_NAME + " TEXT NOT NULL, "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_PRICE + " INTEGER NOT NULL, "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_QUANTITY + " INTEGER NOT NULL    , "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_SUPPLIERNAME + " TEXT NOT NULL, "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_SUPPLIERADDRESS + " TEXT NOT NULL, "
                + com.example.android.inventoryfinalapp.data.BookStoreContract.BookStoreEntry.COLUMN_BOOK_SUPPLIERPHONENUMBER + " INTEGER NOT NULL);";

        db.execSQL(SQL_CREATE_BOOK_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}