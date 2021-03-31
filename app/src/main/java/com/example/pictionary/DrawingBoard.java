package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DrawingBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintView paintView = new PaintView(this);
        setContentView(paintView);
    }
}