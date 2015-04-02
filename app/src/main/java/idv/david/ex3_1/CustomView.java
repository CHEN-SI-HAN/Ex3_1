package idv.david.ex3_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    private Paint paint = new Paint();
    private int color;
    private String shape;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, int color, String shape) {
        super(context);
        this.color = color;
        this.shape = shape;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);

        if (shape != null && shape.equals("circle")) {
            canvas.drawCircle(350, 450, 250, paint);
        } else {
            canvas.drawRect(100, 200, 600, 700, paint);
        }

    }
}
