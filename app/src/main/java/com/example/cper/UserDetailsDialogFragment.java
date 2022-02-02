package com.example.cper;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class UserDetailsDialogFragment extends DialogFragment {


    public UserDetailsDialogFragment() {
        // Required empty public constructor
    }


    public static UserDetailsDialogFragment newInstance(String param1, String param2) {
        UserDetailsDialogFragment fragment = new UserDetailsDialogFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_user_details_dialog, container, false);
    }
}