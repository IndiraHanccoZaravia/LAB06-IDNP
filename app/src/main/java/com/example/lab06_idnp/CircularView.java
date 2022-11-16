package com.example.lab06_idnp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Random;

public class CircularView extends View{

    private Paint paint;
    private double[] porcentaje;
    private RectF rectf;
    private float temp = 0;
    double valores[] = { 20.7, 46.6, 28.6, 14.5, 23.4, 27.4, 32.9, 28.3, 29, 34.8, 32.9, 16.7, 18, 27.5 };
    double total = 0;
    Random r;

    public CircularView(Context context) {
        super(context);
        init();
        porcentaje = new double[valores.length];

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        for (int i = 0; i < valores.length; i++) {
            porcentaje[i] = 360 * (valores[i] / total);
        }
    }
    public CircularView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public CircularView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectf = new RectF(210, 520, 800, 1080);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (int i = 0; i < porcentaje.length; i++) {
            r = new Random();
            if (i == 0) {
                int color = Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));
                paint.setColor(color);
                canvas.drawArc(rectf, 0, (float)porcentaje[i], true, paint);
            } else {
                temp += porcentaje[i - 1];
                int color = Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256));
                paint.setColor(color);
                canvas.drawArc(rectf, temp, (float)porcentaje[i], true, paint);
            }
        }
    }
}
