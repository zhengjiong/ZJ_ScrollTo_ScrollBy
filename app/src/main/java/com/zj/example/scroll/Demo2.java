package com.zj.example.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

/**
 * scrollBy和scrollTo只是移动控件中内容的位置,并不是移动该控件!!!
 *
 * create by zhengjiong
 * Date: 2015-01-01
 * Time: 10:10
 */
public class Demo2 extends Activity{

    private ListView mListView;

    private List<String> mDatas = Arrays.asList(
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item",
            "item"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo2);

        mListView = (ListView) findViewById(R.id.listview);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, mDatas);

        mListView.setAdapter(arrayAdapter);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                mListView.scrollBy(-20, -20);
                break;
            case R.id.btn2:
                mListView.scrollTo(-300, -50);
                break;
        }
    }
}
