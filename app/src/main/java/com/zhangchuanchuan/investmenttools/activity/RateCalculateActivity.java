package com.zhangchuanchuan.investmenttools.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zhangchuanchuan.investmenttools.R;
import com.zhangchuanchuan.investmenttools.utils.RateCalculateUtils;

/**
 * Created by zhangchuanchuan on 17-3-26.
 * 利率计算的Activity
 */

public class RateCalculateActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_calculatie);
        RateCalculateUtils.getAllRate(0.05, 20);
    }





}
