package com.laojiang.slidinglibrary.utils;

import android.app.Activity;
import android.content.Context;

import com.laojiang.slidinglibrary.R;
import com.laojiang.slidinglibrary.SlideBackLayout;

/**
 * 类介绍（必填）：动画工具类
 * Created by Jiang on 2017/6/6 11:25.
 */

public class AnimationUtil {
    private static Context activity;
    private SlideBackLayout mSlideBackLayout;

    private AnimationUtil(Context activity) {
        this.activity = activity;

    }
    private static class Single{
        private  Context activity;

        public Single(Context activity) {
            this.activity = activity;
        }
        public AnimationUtil getUtil(){
            return new AnimationUtil(activity);
        }


    }
    public static AnimationUtil getInstance(Context activity){
        return new Single(activity).getUtil();
    }
    /**
     * 设置进入进出动画
     */
    public void setAnimation(){
        if (activity!=null&&activity instanceof Activity)
            ((Activity)activity).overridePendingTransition(R.anim.base_slide_right_in, R.anim.base_slide_right_out);
    }

    /**
     * 设置当前活动页面的右滑
     */
    public void setSlidingFinish(){
        if (activity!=null)
            mSlideBackLayout = new SlideBackLayout(activity);
        if (mSlideBackLayout!=null)
            mSlideBackLayout.bind();
    }
}
