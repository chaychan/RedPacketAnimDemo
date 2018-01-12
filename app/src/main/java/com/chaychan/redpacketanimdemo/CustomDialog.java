package com.chaychan.redpacketanimdemo;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/*
 * 自定义圆角的dialog
 */
public class CustomDialog extends Dialog {

    private static int default_width = 160; //默认宽度

    private static int default_height = 120;//默认高度

    public CustomDialog(Context context, View layout, int style) {

        this(context, default_width, default_height, layout, style);

    }

    public CustomDialog(Context context, int width, int height, View layout, int style) {

        super(context, style);

        setContentView(layout);

        Window window = getWindow();

        WindowManager.LayoutParams params = window.getAttributes();

        params.gravity = Gravity.CENTER;

        window.setAttributes(params);
    }

}