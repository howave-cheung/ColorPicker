package com.bobo.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bobo.colorpickerview.ColorPickerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTest = findViewById(R.id.tv_color);
        ColorPickerView colorPicker = findViewById(R.id.color_picker);
        colorPicker.setOnColorChangeListener(color -> {
            tvTest.setBackgroundColor(color);
        });
    }
}