package com.zhangchuanchuan.investmenttools.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhangchuanchuan.investmenttools.R;
import com.zhangchuanchuan.investmenttools.adapter.ToolsListAdapter;
import com.zhangchuanchuan.investmenttools.vo.ToolsItemVo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchuanchuan on 17-4-4.
 * 工具列表Activity
 */

public class ToolListActivity extends BaseActivity {

    private RecyclerView toolsListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_list);
        toolsListView = (RecyclerView) findViewById(R.id.tools_list);
        initData();
    }

    //初始化数据
    private void initData() {
        final List<ToolsItemVo> datas = getToolsList();
        ToolsListAdapter adapter = new ToolsListAdapter(this, datas, new ToolsListAdapter.ItemClickListener() {
            @Override
            public void itemClick(int position) {
                Class clazz = datas.get(position).getJumpActivity();
                Intent intent = new Intent();
                intent.setClass(ToolListActivity.this, clazz);
                startActivity(intent);
            }
        });
        toolsListView.setLayoutManager(new LinearLayoutManager(this));
        toolsListView.setAdapter(adapter);
    }


    public List<ToolsItemVo> getToolsList() {
        List<ToolsItemVo> list = new ArrayList<>();
        list.add(new ToolsItemVo("利率计算", RateCalculateActivity.class));
        return list;
    }
}
