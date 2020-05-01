package com.example.fragmentsexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailUserFragment extends Fragment {

    private static final String ARG_MESSAGE = "ARG_MESSAGE";
    private static final String ARG_BACKGROUND = "ARG_BACKGROUND";

    public DetailUserFragment() {
        // Required empty public constructor
    }

    public static DetailUserFragment newFragment(CharSequence message, int background) {
        DetailUserFragment fragment = new DetailUserFragment();

        Bundle args = new Bundle();

        args.putCharSequence(ARG_MESSAGE, message);

        args.putInt(ARG_BACKGROUND, background);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_user, container, false);

        TextView detail = (TextView) view.findViewById(R.id.tv_detail);
        Bundle args = getArguments();

        CharSequence message = args.getCharSequence(ARG_MESSAGE);
        int background = args.getInt(ARG_BACKGROUND);

        detail.setText(message);
        detail.setBackgroundColor(background);

        return view;
    }
}

