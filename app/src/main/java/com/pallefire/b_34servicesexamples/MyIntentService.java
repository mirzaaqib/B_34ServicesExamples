package com.pallefire.b_34servicesexamples;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.Display;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    Handler handler;



    public MyIntentService() {

        // here batch 34 is the thread name but if programmer will not give then it is given by the os like thread-0
        super("Batch 34");
    }

    @Override
    public void onCreate() {
        super.onCreate();
       handler=new Handler();

    }


    @Override
    protected void onHandleIntent(Intent intent) {

        //if we use directly toast here because we cant directly touch ui thread bcz its a part of handler or background thread
        
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MyIntentService.this, "this is the third services example", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

