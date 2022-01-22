package com.motivational.mylibrary.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.motivational.mylibrary.R;

import androidx.appcompat.widget.AppCompatTextView;

import static com.motivational.mylibrary.utils.Constant.ADDRESS_TEXT;
import static com.motivational.mylibrary.utils.Constant.CONTACT_TEXT;
import static com.motivational.mylibrary.utils.Constant.INFO_TEXT;
import static com.motivational.mylibrary.utils.Constant.WELCOME_TEXT;

public class ProfileActivity extends BaseActivity {

    AppCompatTextView address_Text, contact_Text, info_Text;
    Button backIcon;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        address_Text = findViewById(R.id.address_text);
        contact_Text = findViewById(R.id.contact_text);
        info_Text = findViewById(R.id.info_text);

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
        return R.layout.activity_profile;
    }

    @Override
    protected void setData(Bundle bun) {
      if(bun!=null){
          address_Text.setText(bun.getString(ADDRESS_TEXT));
          contact_Text.setText(bun.getString(CONTACT_TEXT));
          info_Text.setText(bun.getString(INFO_TEXT));
      }
    }
}