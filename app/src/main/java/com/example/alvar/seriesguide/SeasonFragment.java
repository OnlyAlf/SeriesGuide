package com.example.alvar.seriesguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SeasonFragment extends Fragment {

    View view;

    public static SeasonFragment getInstance(){
        SeasonFragment seasonFragment = new SeasonFragment();
        return seasonFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_season, container, false);
        return view;
    }
}
