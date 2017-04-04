package com.zhangchuanchuan.investmenttools.vo;

/**
 * Created by zhangchuanchuan on 17-4-4.
 * tools item vo
 */

public class ToolsItemVo {
    private String toolName;

    private Class jumpActivity;

    public ToolsItemVo(String toolName, Class jumpActivity) {
        this.toolName = toolName;
        this.jumpActivity = jumpActivity;
    }

    public Class getJumpActivity() {
        return jumpActivity;
    }

    public void setJumpActivity(Class jumpActivity) {
        this.jumpActivity = jumpActivity;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
}
