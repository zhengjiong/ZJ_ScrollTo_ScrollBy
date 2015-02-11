package com.zj.example.scroll;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * create by zhengjiong
 * Date: 2015-01-01
 * Time: 10:03
 */
public class MainActivity extends ListActivity{

    String[] mDatas = new String[]{
            "demo1",
            "demo2",
            "demo3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, mDatas);

        getListView().setAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position) {
            case 0:
                startActivity(new Intent(this, Demo1.class));
                break;
            case 1:
                startActivity(new Intent(this, Demo2.class));
                break;
            case 2:
                startActivity(new Intent(this, Demo3.class));
                break;
        }
    }
}
