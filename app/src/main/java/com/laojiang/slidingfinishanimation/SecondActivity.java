package com.laojiang.slidingfinishanimation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.laojiang.slidinglibrary.SlideBackLayout;
import com.laojiang.slidinglibrary.utils.AnimationUtil;

/**
 * 类介绍（必填）：
 * Created by Jiang on 2017/6/6 11:31.
 */

class SecondActivity extends AppCompatActivity{

    private SlideBackLayout mSlideBackLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //需要手势右滑的活动界面 添加下面代码
        AnimationUtil.getInstance(SecondActivity.this).setSlidingFinish();
    }
}
