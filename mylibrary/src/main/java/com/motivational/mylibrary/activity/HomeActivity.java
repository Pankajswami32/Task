package com.motivational.mylibrary.activity;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.motivational.mylibrary.R;

import static com.motivational.mylibrary.utils.Constant.WELCOME_TEXT;

public class HomeActivity extends BaseActivity {

    AppCompatTextView welcomeText;
    Button backIcon;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        welcomeText = findViewById(R.id.welcome_text);
        backIcon = findViewById(R.id.button_back);
        setData(getIntent().getExtras());
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_home;
    }

    @Override
    protected void setData(Bundle bun) {
      if(bun!=null){
          welcomeText.setText(bun.getString(WELCOME_TEXT));
      }
    }
}