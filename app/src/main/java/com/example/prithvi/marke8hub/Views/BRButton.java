package com.example.prithvi.marke8hub.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class BRButton extends AppCompatButton {

    public BRButton(Context context) {
        super(context);
        createFont();
    }

    public BRButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public BRButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/brandon_reg.otf");
        setTypeface(font);
    }

}
