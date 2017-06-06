添加依赖：
工程gradle:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
项目moudle：
```
compile 'com.github.JiangAndroidwork:SlidingFinishAnimation:1.0.0'
```
> 可以把slidinglibrary库放到项目中，或者将里面的文件提取出来放在项目中。

## 注意：
1，需要在项目的主题styles中添加
```
<item name="android:windowIsTranslucent">true</item>
<item name="android:windowBackground">@color/touming</item>
```
达到背景页面为透明的效果，其中touming是#00ffffff

 2，activity页面根布局需要设置背景颜色，要不会透明
 
## 用法：

1,在要Intent到指定的activity页面时在startActivity()后面添加
```
AnimationUtil.getInstance(MainActivity.this).setAnimation();
```
目的是统一活动页面滑动的动画效果

2，在要右滑关闭的activity中调用
```
 AnimationUtil.getInstance(SecondActivity.this).setSlidingFinish();
```
