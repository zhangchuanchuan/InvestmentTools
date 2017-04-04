package com.zhangchuanchuan.investmenttools.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhangchuanchuan.investmenttools.R;
import com.zhangchuanchuan.investmenttools.vo.ToolsItemVo;

import java.util.List;

/**
 * Created by zhangchuanchuan on 17-4-4.
 * 适配器
 */

public class ToolsListAdapter extends RecyclerView.Adapter<ToolsListAdapter.ViewHolder> {


    private Context mContext;
    private List<ToolsItemVo> mDataList;
    private ItemClickListener mListener;

    public ToolsListAdapter (Context context, List<ToolsItemVo> dataList, ItemClickListener listener) {
        this.mContext = context;
        this.mDataList = dataList;
        this.mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_tools_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.toolName.setText(mDataList.get(position).getToolName());
        holder.toolName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.itemClick(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView toolName;

        public ViewHolder(View itemView) {
            super(itemView);
            toolName = (TextView) itemView.findViewById(R.id.tool_text);
        }
    }

    public interface ItemClickListener {
        void itemClick(int position);
    }
}
