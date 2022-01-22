package com.motivational.mylibrary.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.motivational.mylibrary.R;

import androidx.appcompat.widget.AppCompatTextView;

import static com.motivational.mylibrary.utils.Constant.ABOUT_TEXT;
import static com.motivational.mylibrary.utils.Constant.ADDRESS_TEXT;
import static com.motivational.mylibrary.utils.Constant.CONTACT_TEXT;
import static com.motivational.mylibrary.utils.Constant.INFO_TEXT;

public class AboutActivity extends BaseActivity {

    AppCompatTextView about_Title, info_Text;
    Button backIcon;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        about_Title = findViewById(R.id.about_title);
        info_Text = findViewById(R.id.information_texr);

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
        return R.layout.activity_about;
    }

    @Override
    protected void setData(Bundle bun) {
      if(bun!=null){
          info_Text.setText(bun.getString(ABOUT_TEXT));
      }
    }
}