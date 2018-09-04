package com.example.prithvi.marke8hub.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class BRBTextView extends android.support.v7.widget.AppCompatTextView {
    public BRBTextView(Context context) {
        super(context);
        createFont();
    }

    public BRBTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public BRBTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/brandon_bld.otf");
        setTypeface(font);
    }

}
