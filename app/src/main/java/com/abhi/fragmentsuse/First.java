package com.abhi.fragmentsuse;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class First extends Fragment {

    EditText name, phone, mail;
    Button btn;

    public First() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        name = view.findViewById(R.id.ed_username);
        phone = view.findViewById(R.id.ed_phone);
        mail = view.findViewById(R.id.ed_mail);

        btn=view.findViewById(R.id.btn_save);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getActivity().getSharedPreferences("Userdata", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();

                editor.putString("Username",name.getText().toString());
                editor.putString("Phone",phone.getText().toString());
                editor.putString("Mail",mail.getText().toString());

                editor.commit();
            }
        });

        return view;
    }
}