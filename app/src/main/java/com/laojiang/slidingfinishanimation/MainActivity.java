package com.laojiang.slidingfinishanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.laojiang.slidinglibrary.utils.AnimationUtil;

public class MainActivity extends AppCompatActivity {

    private Button btStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btStart = (Button) findViewById(R.id.bt_start);
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                //设置活动界面滑动动画效果，有的默认是左右滑动，但是为了统一加上为好
                AnimationUtil.getInstance(MainActivity.this).setAnimation();
            }
        });
    }
}
