package com.zhangchuanchuan.investmenttools.utils;

/**
 * Created by zhangchuanchuan on 17-3-27.
 * 利率计算的工具
 */

public class RateCalculateUtils {

    public static double getAllRate(double rate, int year) {
        double d = 1;
        double all = 0;
        for (int i = 0; i < year; i++) {
            d = d * (1 + rate);
            all = d + all;
        }
        return all;
    }

}
