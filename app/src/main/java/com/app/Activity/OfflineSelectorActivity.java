package com.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.app.R;

/**
 * Created by Florian on 14/12/2017.
 */
public class OfflineSelectorActivity extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.offline_selector, container, false);
        setIntent((Button) view.findViewById(R.id.button), QuizzActivity.class);
        setIntent((Button) view.findViewById(R.id.button2), QuizzActivity.class);
        setIntent((Button) view.findViewById(R.id.button3), QuizzActivity.class);

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