package citypass.jiyun.com.citypass.control.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import citypass.jiyun.com.citypass.R;

public class MainActivity extends AppCompatActivity {

    Handler hand = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 555:
                    startActivity(new Intent(MainActivity.this,HomeActivity.class));
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWelcome();

    }

    private void getWelcome(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                hand.sendEmptyMessageDelayed(555,2000);
            }
        }.start();
    }

}
