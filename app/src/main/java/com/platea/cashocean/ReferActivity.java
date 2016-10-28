package com.platea.cashocean;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ReferActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer);
        Button sendRefer = (Button) findViewById(R.id.btnSend);
        Typeface ionicons = Typeface.createFromAsset(getAssets(),"fonts/ionicons/fonts/ionicons.ttf");

    }
}
