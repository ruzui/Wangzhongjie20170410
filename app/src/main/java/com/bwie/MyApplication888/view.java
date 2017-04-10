package com.bwie.MyApplication888;

        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.util.AttributeSet;
        import android.view.View;

/**
 * Created by dell on 2017/4/10.
 */
public class view extends View {
    private float Xzhi=100;
    private float Yzhi=100;
    public view(Context context) {
        super(context);
    }
    public view(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public view(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setAntiAlias(true);
        canvas.drawCircle(Xzhi,Yzhi,40,paint);
    }
}
