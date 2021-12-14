package com.abhi.fragmentsuse;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Second extends Fragment {

    TextView name, phone, mail;

    public Second() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        name = view.findViewById(R.id.tx_username);
        phone = view.findViewById(R.id.tx_phone);
        mail = view.findViewById(R.id.tx_mail);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("Userdata", Context.MODE_PRIVATE);

        name.setText(sharedPreferences.getString("Username", ""));

        mail.setText(sharedPreferences.getString("Mail", ""));

        phone.setText(sharedPreferences.getString("Phone", ""));

        return view;
    }
}