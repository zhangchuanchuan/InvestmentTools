package com.zhangchuanchuan.investmenttools.wxapi;

import android.content.Context;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * description：
 * ===============================
 * creator：zhangchuanchuan
 * create time：2017/6/8 下午6:15
 * ===============================
 * reasons for modification：
 * Modifier：
 * Modify time：
 */

public class WxUtils {
    public static IWXAPI mAPI;
    private static final String APP_ID = "";
    public static void init(Context context) {
        mAPI = WXAPIFactory.createWXAPI(context, APP_ID, true);
        mAPI.registerApp(APP_ID);
    }
}
