package com.qiku.customviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CustomView extends LinearLayout {
    private ImageView image;
    private EditText editText;
    public  CustomView(Context context) {
        this(context,null);
    }

    public  CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.list,CustomView.this);
        editText = (EditText) findViewById(R.id.editText);
        image = (ImageView) findViewById(R.id.image);

        image.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(" ");
            }
        });

    }
}
