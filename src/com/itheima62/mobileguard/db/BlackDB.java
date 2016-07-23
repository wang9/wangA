package com.itheima62.mobileguard.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Administrator
 * ���������ݿ�
 */
public class BlackDB extends SQLiteOpenHelper {

	/**
	 * ��ʼ�汾��Ϣ
	 * @param context
	 */
	public BlackDB(Context context) {
		super(context, "black.db", null,2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//ֻ��ʼһ��
		//������
		db.execSQL("create table blacktb(_id integer primary key autoincrement,phone text,mode integer)");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//�汾�ŷ����仯��ִ�д˷���
		//�������
		db.execSQL("drop table blacktb");
		onCreate(db);
	}

}
