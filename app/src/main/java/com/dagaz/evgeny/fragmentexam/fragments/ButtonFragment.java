package com.dagaz.evgeny.fragmentexam.fragments;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import com.dagaz.evgeny.fragmentexam.R;

/**
 * Created by Evgeny on 2/10/2016.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewHierarchy = inflater.inflate(R.layout.button_fragment, container, false);

        return viewHierarchy;
    }

}
