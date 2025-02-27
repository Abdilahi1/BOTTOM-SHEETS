package com.example.problem5;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button in the layout
        Button openBottomSheet = findViewById(R.id.btnOpenSheet);

        // Set click listener on the button
        openBottomSheet.setOnClickListener(v -> {
            // Create an instance of BottomSheetDialog
            BottomSheetDialog bottomSheet = new BottomSheetDialog();

            // Show the bottom sheet
            bottomSheet.show(getSupportFragmentManager(), "ModalBottomSheet");
        });
    }
}
