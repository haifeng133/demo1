package com.liuhaifeng.broadcastbestpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.force_offline);
        button1.setOnClickListener(new Button1Listener());
    }
    class Button1Listener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(".FORCE_OFFLINE");
            sendBroadcast(intent);
        }
    }
}
