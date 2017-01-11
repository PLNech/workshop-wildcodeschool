package fr.wildcodeschool.amazin;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;


public class NotNullTextView extends android.support.v7.widget.AppCompatTextView {
    public NotNullTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override public void setText(CharSequence text, BufferType type) {
        if (text == null) {
            setVisibility(GONE);
        } else {
            setVisibility(VISIBLE);
            super.setText(text, type);
        }
    }
}
