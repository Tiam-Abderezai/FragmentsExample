package com.example.fragmentsexample;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MasterUserFragment extends Fragment {
    public interface ItemClickListener {
        public void itemClicked(CharSequence message, int background);
    }

    private ItemClickListener mListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (ItemClickListener) context;
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        mListener = (ItemClickListener) activity;
    }

    public MasterUserFragment() {

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_master_user, container, false);
        final TextView top = (TextView) view.findViewById(R.id.tv_top);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.itemClicked(top.getText(), Color.parseColor("#FF5555"));
            }

        });

        final TextView middle = (TextView) view.findViewById(R.id.tv_middle);
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.itemClicked(middle.getText(), Color.parseColor("#FFFF99"));
            }

        });

        final TextView bottom = (TextView) view.findViewById(R.id.tv_bottom);
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.itemClicked(bottom.getText(), Color.parseColor("#5555FF"));
            }

        });
    return view;
    }

}
