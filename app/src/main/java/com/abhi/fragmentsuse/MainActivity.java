package com.abhi.fragmentsuse;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.root,new First()).commit();
    }

    public void change(View view) {
        Button btn=(Button) view;

        if(btn.getText().equals("First")){
            getSupportFragmentManager().beginTransaction().replace(R.id.root,new First()).commit();
        }else{
            getSupportFragmentManager().beginTransaction().replace(R.id.root,new Second()).commit();
        }
    }
}