package gupuru.paintcodesample;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;


public class DroidoView extends View {

    public DroidoView(Context context) {
        super(context);
        init(null, 0);
    }

    public DroidoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public DroidoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.DroidoView, defStyle, 0);

        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        DroidoStyleKit.drawDroido(canvas, new RectF(0, 0, getWidth(), getHeight()), DroidoStyleKit.ResizingBehavior.AspectFit);
    }

}
