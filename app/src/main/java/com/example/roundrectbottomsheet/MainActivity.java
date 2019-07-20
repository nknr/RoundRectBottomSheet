package com.example.roundrectbottomsheet;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void show(View view){
        RoundedBottomSheetDialogFragment bottomSheetFragment = new RoundedBottomSheetDialogFragment();
        bottomSheetFragment.show(getSupportFragmentManager(), bottomSheetFragment.getTag());
    }
}
