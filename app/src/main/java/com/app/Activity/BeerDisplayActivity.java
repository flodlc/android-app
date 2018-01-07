package com.app.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.Service.DownloadImageTask;
import com.app.R;
import com.google.gson.internal.LinkedTreeMap;

/**
 * Created by Florian on 05/01/2018.
 */
public class BeerDisplayActivity extends Fragment {

    public static BeerDisplayActivity newInstance(LinkedTreeMap beer) {
        BeerDisplayActivity f = new BeerDisplayActivity();
        Bundle args = new Bundle();
        args.putSerializable("beer", beer);
        f.setArguments(args);
        return f;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beer_display, container, false);
        LinkedTreeMap beer = (LinkedTreeMap) getArguments().getSerializable("beer");

        ((TextView) view.findViewById(R.id.beerName)).setText((String) beer.get("name"));
        ((TextView) view.findViewById(R.id.beerAlc)).setText(beer.get("abv").toString());
        new DownloadImageTask((ImageView) view.findViewById(R.id.beerImage))
                .execute("https://images.punkapi.com/v2/keg.png");

        return view;
    }
}