package com.example.base;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.telephony.SmsManager;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.location.Location;

public class MainActivity extends Activity {
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.buttonSend);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String phoneNumber = "5203183626";
                String message = "Hello World!";
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(phoneNumber, null, message, null, null);


        }});
//        Location location = new Location();
//        location.getLatitude();
//        location.getLongitude();
        String forText = "http://maps.google.com/maps?q=lat,lng";
        SmsManager smsManager =     SmsManager.getDefault();
        smsManager.sendTextMessage("Phone Number", null, "Message", null, null);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
