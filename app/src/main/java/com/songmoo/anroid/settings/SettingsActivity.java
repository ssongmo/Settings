package com.songmoo.anroid.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{
    //1. 레이아웃.xml에서 사용하는 뷰 객체 정의
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        //2. findViewId로 뷰 세팅
        btn = (Button) findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textview);

        //3. 버튼에 onClickListener 달기
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                tv.setText(BuildConfig.MYURL);
        }
    }
}
