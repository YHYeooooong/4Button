package com.example.user.a4button;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button1; Button Button2; Button Button3; Button Button4;

        Button1=(Button)findViewById(R.id.Button1);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mlntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nate.com/"));
                startActivity(mlntent);

            }
        });
        Button1.setBackgroundColor(Color.GRAY);

        Button2=(Button)findViewById(R.id.Button2);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mlntent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/911"));
                startActivity(mlntent);
            }
        });
        Button2.setBackgroundColor(Color.GREEN);


        Button3=(Button)findViewById(R.id.Button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent= new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mintent);
            }
        });
        Button3.setBackgroundColor(Color.RED);

        Button4=(Button)findViewById(R.id.Button4);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
