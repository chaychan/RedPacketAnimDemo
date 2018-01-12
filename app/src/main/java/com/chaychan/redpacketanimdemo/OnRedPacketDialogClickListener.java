package com.chaychan.redpacketanimdemo;

/**
 * @author ChayChan
 * @description: 红包点击的监听
 * @date 2017/11/27  17:36
 */

public interface OnRedPacketDialogClickListener {
    /**
     * 点击了关闭按钮
     */
    void onCloseClick();

    /**
     * 点击了打开红包的按钮
     */
    void onOpenClick();

}
