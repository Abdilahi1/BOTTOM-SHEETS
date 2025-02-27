package com.example.problem5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the bottom sheet layout
        View view = inflater.inflate(R.layout.bottom_sheet, container, false);

        // Find buttons from the layout
        Button algoButton = view.findViewById(R.id.btnSubmit);
        Button courseButton = view.findViewById(R.id.btnCancel);

        // Set click listener for Algorithm button
        algoButton.setOnClickListener(v -> {
                    Toast.makeText(getActivity(), "First Button Clicked", Toast.LENGTH_SHORT).show();

                    //  dismiss(); // Close the bottom sheet

                });


        // Set click listener for Course button
        courseButton.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Second Button Clicked", Toast.LENGTH_SHORT).show();
            dismiss(); // Close the bottom sheet
        });

        return view;
    }
}

