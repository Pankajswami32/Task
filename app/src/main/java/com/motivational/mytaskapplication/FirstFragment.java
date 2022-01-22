package com.motivational.mytaskapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.motivational.mylibrary.activity.AboutActivity;
import com.motivational.mylibrary.activity.HomeActivity;
import com.motivational.mylibrary.activity.ProfileActivity;
import com.motivational.mylibrary.utils.Constant;
import com.motivational.mylibrary.utils.LocaleHelper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.home_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), HomeActivity.class);
                in.putExtra(Constant.WELCOME_TEXT,getResources().getString(R.string.welcome_title));
                startActivity(in);
            }
        });
        view.findViewById(R.id.profile_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), ProfileActivity.class);
                in.putExtra(Constant.ADDRESS_TEXT,getResources().getString(R.string.address_title));
                in.putExtra(Constant.CONTACT_TEXT,getResources().getString(R.string.contact_title));
                in.putExtra(Constant.INFO_TEXT,getResources().getString(R.string.info_title));
                startActivity(in);
            }
        });
        view.findViewById(R.id.about_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AboutActivity.class);
                in.putExtra(Constant.ABOUT_TEXT,getResources().getString(R.string.about_title));
                startActivity(in);
            }
        });

        view.findViewById(R.id.english_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocaleHelper.setLanguageLocale(getActivity(), "en");
                restartActivity();
            }
        });
        view.findViewById(R.id.dutch_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocaleHelper.setLanguageLocale(getActivity(), "da");
                restartActivity();
            }
        });
    }

    // to refresh activity after changing the language
    private void restartActivity() {
        Intent intent = getActivity().getIntent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        getActivity().finish();
        startActivity(intent);
    }
}