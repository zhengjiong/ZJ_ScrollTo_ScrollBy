package com.zj.example.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * scrollBy和scrollTo只是移动控件中内容的位置,并不是移动该控件!!!
 * create by zhengjiong
 * Date: 2015-01-01
 * Time: 12:34
 */
public class Demo3 extends Activity{

    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;

    private MyViewGroup mMyViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        SCREEN_WIDTH = displayMetrics.widthPixels;
        SCREEN_HEIGHT = displayMetrics.heightPixels;

        setContentView(R.layout.demo3);

        mMyViewGroup = (MyViewGroup) findViewById(R.id.viewgroup);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                mMyViewGroup.scrollBy(100, 0);
                break;
            case R.id.btn2:
                mMyViewGroup.scrollTo(0, 0);
                break;
        }
    }
}
