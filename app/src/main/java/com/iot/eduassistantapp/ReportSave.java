package com.iot.eduassistantapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ReportSave extends SQLiteOpenHelper {
    public ReportSave(@Nullable Context context) {
        super(context, "memo.db", null, 1);
    }
    //테이블 생성
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table memo(_id integer primary key autoincrement,content text,wdate text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
