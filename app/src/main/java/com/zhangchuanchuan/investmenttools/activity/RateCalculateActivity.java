package com.zhangchuanchuan.investmenttools.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.zhangchuanchuan.investmenttools.R;
import com.zhangchuanchuan.investmenttools.utils.RateCalculateUtils;

import org.w3c.dom.Text;

/**
 * Created by zhangchuanchuan on 17-3-26.
 * 利率计算的Activity
 */

public class RateCalculateActivity extends BaseActivity {

    //input
    private Spinner frequency;
    private EditText money;
    private EditText rate;
    private EditText time;

    //calculate
    private Button calculate;

    //output
    private TextView investmentMoney;
    private TextView totalMoney;
    private TextView totalRate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_calculatie);
        frequency = (Spinner) findViewById(R.id.frequency);
        money = (EditText) findViewById(R.id.money);
        rate = (EditText) findViewById(R.id.rate_input);
        time = (EditText) findViewById(R.id.time_number);

        calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        investmentMoney = (TextView) findViewById(R.id.investment_money);
        totalMoney = (TextView) findViewById(R.id.total_money);
        totalRate = (TextView) findViewById(R.id.total_rate);

    }

    private void calculate() {
        try {
            double yearRate = Double.valueOf(rate.getText().toString()) / 100;
            int times = Integer.valueOf(time.getText().toString());
            double allRate = RateCalculateUtils.getAllRate(yearRate, times);

            int investMoney = (Integer.valueOf(money.getText().toString())) * times;
            double allMoney = (investMoney/times) * allRate ;
            investmentMoney.setText("总投：" + investMoney + "元");
            totalRate.setText("收益率：" + (allMoney/investMoney) * 100 + "%");
            totalMoney.setText("总得：" + allMoney + "");
        } catch (Exception e) {
            investmentMoney.setText(e.toString());
        }
    }





}
