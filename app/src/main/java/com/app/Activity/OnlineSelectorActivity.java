package com.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.app.R;


public class OnlineSelectorActivity extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.online_selector, container, false);
        setIntent((Button) view.findViewById(R.id.button4), QuizzActivity.class);

        return view;
    }

    private void setIntent(Button button, final Class className) {
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), className);
                startActivity(intent);
            }
        });
    }
}