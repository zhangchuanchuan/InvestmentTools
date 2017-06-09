package com.zhangchuanchuan.investmenttools;

import android.app.Application;
import android.content.Context;

import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.zhangchuanchuan.investmenttools.wxapi.WxUtils;

/**
 * description：
 * ===============================
 * creator：zhangchuanchuan
 * create time：2017/6/8 下午6:14
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        WxUtils.init(base);
    }
}
