package com.platea.cashocean;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;

public class LoginActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TelephonyManager telmgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        int simState = telmgr.getSimState();

        Intent intent = new Intent(this, ErrorPage.class);
        switch (simState) {
            case TelephonyManager.SIM_STATE_ABSENT:
                startActivity(intent);
                break;
            case TelephonyManager.SIM_STATE_READY:
                Log.d("titlee", "Massage1");
                break;
            case TelephonyManager.SIM_STATE_UNKNOWN:
                startActivity(intent);
                break;
        }
    }

}

