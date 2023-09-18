package com.example.fragmentpractice;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FirstFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("data", "first fragment activity activity: onCreate!!");
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("data", "first fragment activity activity: onCreateView!!");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("data", "attached!!!!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("data", "first fragment activity activity: on Resume!!");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        Log.d("data", "first fragment on activity created");
    }
}