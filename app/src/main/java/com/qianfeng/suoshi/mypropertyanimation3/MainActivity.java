package com.qianfeng.suoshi.mypropertyanimation3;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //newBranch
        test(true);
    }

    public void click(View view){

        /**
         * 五秒钟内，button显示0~100
         */
//        final Button button = (Button) view;
//        ValueAnimator animator = ValueAnimator.ofInt(0,100);
//        animator.setDuration(5000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                Integer value = (Integer) valueAnimator.getAnimatedValue();
//                button.setText(""+value);
//            }
//        });
//        animator.start();

        ValueAnimator animator = ValueAnimator.ofObject(new TypeEvaluator<PointF>() {
            //fraction:时间因子，0~1之间
            @Override
            public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
                return null;
            }
        });
    }

    public boolean test(boolean b){
        return true;
    }
}
