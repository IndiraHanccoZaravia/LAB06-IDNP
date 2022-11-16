package com.example.lab06_idnp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class BarraView extends View {

    private Paint paint;
    private RectF rectf;
    double valores[] = { 20.7, 46.6, 28.6, 14.5, 23.4, 27.4, 32.9, 28.3, 29, 34.8, 32.9, 16.7, 18, 27.5 };

    public BarraView(Context context) {
        super(context);
        init();
    }

    public BarraView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BarraView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectf = new RectF(210, 210, 800, 800);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        canvas.drawRect(rectf,paint);
    }
}
