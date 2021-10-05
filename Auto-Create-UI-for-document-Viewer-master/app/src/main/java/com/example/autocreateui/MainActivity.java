package com.example.autocreateui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button createUI;
    LinearLayout mainUI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createUI = findViewById(R.id.CreateUI);
        mainUI = findViewById(R.id.MainUI);

        createUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addElements();
            }
        });
    }

    public void addElements(){


        ArrayList<ImageView> imageViews = new ArrayList<>();
//
        ImageView image = new ImageView(this);
        image.setLayoutParams(new RelativeLayout.LayoutParams(200,200));
        image.setMaxHeight(20);
        image.setMaxWidth(20);
        image.setBackgroundColor(Color.BLUE);
        imageViews.add(image);
//        params.topMargin = 5;
//        mainUI.addView(image);

        TextView text = new TextView(this);
        text.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT));
        text.setBackgroundColor(Color.GRAY);
        text.setText("HELLLLOOO");
        text.setTextColor(Color.BLUE);
        text.setTextSize(15);


        // Adds the view to the layout
        LinearLayout imageLayout = new LinearLayout(getApplicationContext());
        LinearLayout textLayout = new LinearLayout(getApplicationContext());

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.BELOW, image.getId());

//        textLayout.setLayoutParams(params);
        imageLayout.setLayoutParams(params);
//        mainUI.addView(textLayout);
        mainUI.addView(imageLayout);

        //Calling to add textview below image view

        addTextViews();

        for (int i = 0; i < 15; i++) {

            final ImageView imageView = new ImageView(this);

            imageView.setTag(i);
            imageView.setImageResource(R.drawable.ic_launcher_background);

            imageView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.e("Tag", "" + imageView.getTag());
                }
            });
        }

    }

    public void addTextViews(){


        TextView text = new TextView(this);
        text.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT));
        text.setBackgroundColor(Color.GRAY);
        text.setText("HELLLLOOO");
        text.setTextColor(Color.BLUE);
        text.setTextSize(15);


        // Adds the view to the layout
        LinearLayout textLayout = new LinearLayout(getApplicationContext());

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.BELOW, text.getId());

        textLayout.setLayoutParams(params);
        mainUI.addView(textLayout);

        for (int i = 0; i < 15; i++) {

            final TextView textView = new TextView(this);
            textView.setBackgroundColor(Color.GRAY);
            textView.setText("HELLLLOOO");
            textView.setTextColor(Color.BLUE);
            textView.setTextSize(15);

            textView.setTag(i);
            textLayout.addView(textView);

            textView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Log.e("Tag", "" + textView.getTag());
                }
            });
        }
    }



}
