package com.example.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.telephony.SmsManager;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.location.Location;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    Timer notifyTimer = new Timer(true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start=(Button)findViewById(R.id.start_button);
        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO have the time parameter below provided by entry
                EditText time = (EditText) findViewById(R.id.user_Notification_Interval);
                NotifyTask notify = new NotifyTask();
                notifyTimer.schedule(notify, 5000);//Integer.parseInt(time.getText().toString()));

                // TODO run() in Notify task needs to provide option of SMS and cancel
        }});
    }

    public class NotifyTask extends TimerTask {
        @Override
        public void run(){
            //GO CHECK OUT THE APP BRO
            Button start=(Button)findViewById(R.id.start_button);
            Intent newEntryIntent = new Intent(start.getContext(), TouchBaseActivity.class);
            // start the next Activity the prepared Intent
            startActivity(newEntryIntent);
        }
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
