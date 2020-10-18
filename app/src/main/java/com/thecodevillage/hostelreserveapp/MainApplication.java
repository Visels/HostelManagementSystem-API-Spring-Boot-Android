package com.thecodevillage.hostelreserveapp;

import android.app.Application;

import com.thecodevillage.hostelreserveapp.db.DaoMaster;
import com.thecodevillage.hostelreserveapp.db.DaoSession;

import org.greenrobot.greendao.database.Database;

public class MainApplication extends Application {

    private DaoSession daoSession;

    @Override
    public void onCreate(){
        super.onCreate();

        //regular SQLite Database
        DaoMaster.DevOpenHelper helper= new DaoMaster.DevOpenHelper(this,"hostel_reserve",null);
        Database db=helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession(){
        return daoSession;
    }

}
