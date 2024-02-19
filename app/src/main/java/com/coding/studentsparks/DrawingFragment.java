package com.coding.studentsparks;

import static com.coding.studentsparks.display.colorList;
import static com.coding.studentsparks.display.current_brush;
import static com.coding.studentsparks.display.pathList;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.graphics.Path;
import android.widget.Button;


public class DrawingFragment extends Fragment {
    public static Path path = new Path();
    public static Paint paint_brush = new Paint();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_drawing, container, false);
    }

            @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button pencil = getView().findViewById(R.id.draw_button);
        Button eraser = getView().findViewById(R.id.erase_button);
        Button red = getView().findViewById(R.id.red_button);
        Button yello = getView().findViewById(R.id.yello_button);
        Button green = getView().findViewById(R.id.green_button);
        Button magenta = getView().findViewById(R.id.magenta_button);
        Button blue = getView().findViewById(R.id.blue_button);
        Button share = getView().findViewById(R.id.share_button);

        eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pathList.clear();
                colorList.clear();
                path.reset();
            }
        });
        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.BLACK);
                currentColor(paint_brush.getColor());
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.RED);
                currentColor(paint_brush.getColor());
            }
        });
        yello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.YELLOW);
                currentColor(paint_brush.getColor());
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.GREEN);
                currentColor(paint_brush.getColor());
            }
        });
        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.MAGENTA);
                currentColor(paint_brush.getColor());
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint_brush.setColor(Color.BLUE);
                currentColor(paint_brush.getColor());
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/jpeg");
                String Body = "Share Your Drawing!";
                String Sub = "You can share through any platform!";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share using: "));

            }
        });
    }








    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }

}