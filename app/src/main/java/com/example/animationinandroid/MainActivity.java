package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWord;
    private TextView txtHiWorld;
    private boolean isHelloWordVisible = true;
    private TextView txtAndroid;
    private Button btnAnimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWord = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);
        txtAndroid.setY(-1700);
        txtHelloWord.setX(1000);
        txtHiWorld.setX(-1000);
        btnAnimate = findViewById(R.id.btnAnimate);

        txtHelloWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isHelloWordVisible){
                    txtHelloWord.animate().alpha(0.0f).setDuration(1000);
                    txtHiWorld.animate().alpha(1f).setDuration(2000);
                    isHelloWordVisible = false;
                }else if (! isHelloWordVisible){
                    txtHelloWord.animate().alpha(1f).setDuration(1000);
                    txtHiWorld.animate().alpha(0.0f).setDuration(2000);
                    isHelloWordVisible = true;
                }
            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txtAndroid.animate().translationX(300f).setDuration(5000);
//                txtAndroid.animate().rotation(1800f).setDuration(50000);
//                txtAndroid.animate().rotationBy(-3000f).setDuration(5000);
//                txtAndroid.animate().rotationX(3600f).translationY(400).setDuration(5000);
                txtAndroid.animate().scaleX(0.2f).scaleY(0.2f).setDuration(5000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWord.animate().translationXBy(-100).rotation(3600).setDuration(2000);
                txtHiWorld.animate().translationXBy(100).setDuration(2000);
                txtAndroid.animate().translationYBy(100).alphaBy(0.9f).setDuration(2000);
            }
        });
    }
}
