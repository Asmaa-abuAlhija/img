package com.example.asmaa;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    int c=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
    }
    public void right (View view){
        if(c==1){
            img.setImageResource(R.drawable.pic);
            c=2;
        }
        else{
            if(c==2){
                img.setImageResource(R.drawable.mia3);
                c=3;
            }
            else{
                if(c==3){
                    img.setImageResource(R.drawable.el);
                    c=4;
                }
                else{
                    if(c==4){
                        img.setImageResource(R.drawable.cat);
                        c=5;
                    }
                    else{
                        img.setImageResource(R.drawable.mi1);
                        c=1;
                    }
                }
            }
        }
    }
    public void left (View view){
        if(c==5){
            img.setImageResource(R.drawable.el);
            c=4;
        }
        else{
            if(c==4){
                img.setImageResource(R.drawable.mia3);
                c=3;
            }
            else{
                if(c==3){
                    img.setImageResource(R.drawable.pic);
                    c=2;
                }
                else{
                    if(c==2){
                        img.setImageResource(R.drawable.mi1);
                        c=1;
                    }
                    else{
                        img.setImageResource(R.drawable.cat);
                        c=5;
                    }
                }
            }
        }
    }
}