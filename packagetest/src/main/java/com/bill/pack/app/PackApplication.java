package com.bill.pack.app;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 作者：Create on 2017/10/28 11:28  by  bill
 * 描述：全局的application
 * 最近修改：2017/10/28 11:28 modify by bill
 */
public class PackApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);    // 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);
    }
}
