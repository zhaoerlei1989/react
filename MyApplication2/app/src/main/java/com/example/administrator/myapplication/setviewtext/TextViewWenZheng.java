package com.example.administrator.myapplication.setviewtext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class TextViewWenZheng extends View {
    Paint mPaint;
    public TextViewWenZheng(Context context) {
        this(context,null);
    }

    public TextViewWenZheng(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TextViewWenZheng(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    public  void initPaint(){
        mPaint=new Paint();
        mPaint.setColor(Color.BLACK);       //设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);  //设置画笔模式为填充
        mPaint.setStrokeWidth(10f);         //设置画笔宽度为10px
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        setCrile(canvas);
//        setdrawPoint(canvas);
//        setLine(canvas);
//        setRect(canvas);
//        setCrlieRect(canvas);
        settranslate(canvas);

    }
    /**
     * 自定义开始由简单开始
     */
    public void  setCrile(Canvas canvas){
        // 在坐标原点绘制一个黑色圆形
        mPaint.setColor(Color.BLACK);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);
        // 在坐标原点绘制一个蓝色圆形
        mPaint.setColor(Color.BLUE);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);
    }
    public void setdrawPoint(Canvas canvas){
        canvas.drawPoint(200,200,mPaint);
        canvas.drawPoints(new float[]{          //绘制一组点，坐标位置由float数组指定
                500, 500,
                500, 600,
                500, 700
        },mPaint);

    }

    /**
     * 绘制一个线
     * @param canvas
     */
    public void setLine(Canvas canvas){
        mPaint.setColor(Color.RED);
        canvas.drawLine(10,10,200,200,mPaint);
        canvas.drawLines(new float[]{               // 绘制一组线 每四数字(两个点的坐标)确定一条线
                100,200,200,200,
                100,300,200,300
        },mPaint);
    }
    /**
     * 绘制一个矩形
     */
    public void setRect(Canvas canvas){
        canvas.drawRect(100,1000,400,500,mPaint);
        // 第二种
        Rect rect = new Rect(100,100,800,400);
        canvas.drawRect(rect,mPaint);

        // 第三种
        RectF rectF = new RectF(100,100,800,400);
        canvas.drawRect(rectF,mPaint);
    }
    /**
     * 绘制圆角矩形：看到这里,相信很多观众会产生一个疑问，为什么会有Rect和RectF两种？两者有什么区别吗？

     *答案当然是存在区别的，两者最大的区别就是精度不同，Rect是int(整形)的，而RectF是float(单精度浮点型)的。
     *除了精度不同，两种提供的方法也稍微存在差别，在这里我们暂时无需关注，想了解更多参见官方文档 Rect 和 RectF
     */
    public void setCrlieRect(Canvas canvas){
    // 第一种
        RectF rectF = new RectF(100,100,800,400);
//        canvas.drawRoundRect(rectF,30,30,mPaint);
     // 第二种
       canvas.drawRoundRect(100,100,800,400,30,30,mPaint);
    }

    /**
     * 位移
     * @param canvas
     */
    public void settranslate(Canvas canvas){
        mPaint.setColor(Color.BLACK);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);

       // 在坐标原点绘制一个蓝色圆形
        mPaint.setColor(Color.BLUE);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);
    }

    /**
     * 缩放
     * public void scale (float sx, float sy)
     public final void scale (float sx, float sy, float px, float py)
     这两个方法中前两个参数是相同的分别为x轴和y轴的缩放比例。而第二种方法比前一种多了两个参数，用来控制缩放中心位置的。
     * @param canvas
     */
    public void setScale(Canvas canvas){

    }
}
