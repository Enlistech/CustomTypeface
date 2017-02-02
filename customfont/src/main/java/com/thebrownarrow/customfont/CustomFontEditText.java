package com.thebrownarrow.customfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.util.Log;

public class CustomFontEditText extends AppCompatEditText {

    public CustomFontEditText(Context context) {
        super(context);
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        applyCustomTypeface(context, attributeSet);
    }

    public CustomFontEditText(Context context, AttributeSet attributeSet, int defStyle) {
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
            Log.e("Custom Typeface", "Unable to load typeface: " + e.getMessage());
            return false;
        }
        setTypeface(typeface);
        return true;
    }
}