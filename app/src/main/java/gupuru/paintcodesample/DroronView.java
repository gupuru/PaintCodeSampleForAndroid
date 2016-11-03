package gupuru.paintcodesample;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;


public class DroronView extends View {

    private int mColor;
    private float leftAngle;
    private float rightAngle;

    public DroronView(Context context) {
        super(context);
        init(null, 0);
    }

    public DroronView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public DroronView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.DroronView, defStyle, 0);

        mColor = a.getColor(R.styleable.DroronView_color, 0xFFFFFFFF);
        leftAngle = a.getFloat(R.styleable.DroronView_leftAngle, 0);
        rightAngle = a.getFloat(R.styleable.DroronView_rightAngle, 0);

        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        DroidoStyleKit.drawDroron(canvas,
                new RectF(0, 0, getWidth(), getHeight()),
                DroidoStyleKit.ResizingBehavior.AspectFit,
                mColor,
                leftAngle,
                rightAngle);

    }

    public void setLeftAngle(float leftAngle) {
        this.leftAngle = leftAngle;
        invalidate();
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
        invalidate();
    }

    public void setRightAngle(float rightAngle) {
        this.rightAngle = rightAngle;
        invalidate();
    }

}
