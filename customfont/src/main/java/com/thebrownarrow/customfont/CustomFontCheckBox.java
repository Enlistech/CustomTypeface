package com.thebrownarrow.customfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.util.Log;

public class CustomFontCheckBox extends AppCompatCheckBox {

    public CustomFontCheckBox(Context context) {
        super(context);
    }

    public CustomFontCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        applyCustomTypeface(context, attributeSet);
    }

    public CustomFontCheckBox(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
        applyCustomTypeface(context, attributeSet);
    }

    private void applyCustomTypeface(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomTypeface);
        String customFont = typedArray.getString(R.styleable.CustomTypeface_custom_typeface);
        applyCustomTypeface(context, customFont);
        typedArray.recycle();
    }

    public boolean applyCustomTypeface(Context context, String asset) {
        Typeface typeface;
        try {
            typeface = Typeface.createFromAsset(context.getAssets(), asset);
        } catch (Exception e) {
            return false;
        }
        setTypeface(typeface);
        return true;
    }
}