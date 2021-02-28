package com.example.bottomsheet_qaifi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private LinearLayout bottomSheetLayout;
    private BottomSheetBehavior behavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomSheetLayout = findViewById(R.id.bottomSheetId);

        behavior = BottomSheetBehavior.from(bottomSheetLayout);

        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

                switch (newState){

                    case BottomSheetBehavior.STATE_COLLAPSED:
                        Toast.makeText(MainActivity.this, "Sheet Collapsed", Toast.LENGTH_SHORT).show();
                        break;

                    case BottomSheetBehavior.STATE_EXPANDED:
                        Toast.makeText(MainActivity.this, "Sheet Expanded", Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }
}