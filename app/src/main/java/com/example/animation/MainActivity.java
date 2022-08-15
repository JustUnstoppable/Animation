package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean princeIsShowing=true;
    public void fade(View view){
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageViewP=findViewById(R.id.imageViewP);
//        if(princeIsShowing) {
//            princeIsShowing=false;
//            imageView.animate().alpha(0).setDuration(2000);
//            imageViewP.animate().alpha(1).setDuration(2000);
//        }
//        else{
//            princeIsShowing=true;
//            imageView.animate().alpha(1).setDuration(2000);
//            imageViewP.animate().alpha(0).setDuration(2000);
//        }
//
//        imageView.animate().translationYBy(10000);
//        imageView.animate().rotation(3600).alpha(0).setDuration(1000);

       imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setX(-1000);
        imageView.animate().translationXBy(1000).rotation(3600).setDuration(20000);
    }
}