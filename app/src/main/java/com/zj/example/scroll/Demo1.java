package com.zj.example.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


/**
 * scrollBy是在现在的位置基础上移动多少距离
 * scrollTo是直接移動到什麼地方
 *
 * ScrollBy和ScrollTo是
 *
 * create by zhengjiong
 * Date: 2015-01-01
 * Time: 10:10
 */
public class Demo1 extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1);

        mTextView = (TextView) findViewById(R.id.textview);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                mTextView.scrollBy(20, 20);
                break;
            case R.id.btn2:
                mTextView.scrollTo(-300, -300);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
