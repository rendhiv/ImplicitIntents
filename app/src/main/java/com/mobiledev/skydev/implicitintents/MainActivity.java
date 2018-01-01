package com.mobiledev.skydev.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button browse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browse = (Button) findViewById(R.id.button1);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Auto-generated method stub

                Uri uriUrl = Uri.parse("https://www.mobiledev-id.com");
                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });
    }
}