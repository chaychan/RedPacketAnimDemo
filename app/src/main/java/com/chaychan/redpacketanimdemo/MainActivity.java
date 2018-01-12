package com.chaychan.redpacketanimdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View mRedPacketDialogView;
    private RedPacketViewHolder mRedPacketViewHolder;
    private CustomDialog mRedPacketDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        RedPacketEntity entity = new RedPacketEntity("chaychan", "http://upload.51qianmai.com/20171205180511192.png", "大吉大利，今晚吃鸡");
        showRedPacketDialog(entity);
    }

    public void showRedPacketDialog(RedPacketEntity entity) {
        if (mRedPacketDialogView == null) {
            mRedPacketDialogView = View.inflate(this, R.layout.dialog_red_packet, null);
            mRedPacketViewHolder = new RedPacketViewHolder(this, mRedPacketDialogView);
            mRedPacketDialog = new CustomDialog(this, mRedPacketDialogView, R.style.custom_dialog);
            mRedPacketDialog.setCancelable(false);
        }

        mRedPacketViewHolder.setData(entity);
        mRedPacketViewHolder.setOnRedPacketDialogClickListener(new OnRedPacketDialogClickListener() {
            @Override
            public void onCloseClick() {
                mRedPacketDialog.dismiss();
            }

            @Override
            public void onOpenClick() {
                //领取红包,调用接口
            }
        });

        mRedPacketDialog.show();
    }
}
