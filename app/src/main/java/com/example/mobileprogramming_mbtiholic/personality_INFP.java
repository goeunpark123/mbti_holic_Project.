package com.example.mobileprogramming_mbtiholic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TabHost;
import android.widget.TextView;

public class personality_INFP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality__infp);

        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1);
        tabHost1.setup();

        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.infp_성격);
        ;       ts1.setIndicator("성격");
        tabHost1.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.infp_직업);
        ts2.setIndicator("직업");
        tabHost1.addTab(ts2);
        TextView s_career = (TextView)findViewById(R.id.infp_직업2);
        s_career.setMovementMethod(new ScrollingMovementMethod());
    }
}
