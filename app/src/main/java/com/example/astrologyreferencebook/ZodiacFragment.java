package com.example.astrologyreferencebook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.astrologyreferencebook.models.ZodiacSign;

public class ZodiacFragment extends Fragment {
    private ZodiacSign zodiacSign;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.zodiac_fragment, null);

        if (getArguments() != null) {
            zodiacSign = (ZodiacSign) getArguments().getSerializable("zodiacSignList");
        }

        TextView txtTitle = view.findViewById(R.id.txtTitle);
        TextView txtPeriod = view.findViewById(R.id.txtPeriod);
        TextView txtDescription = view.findViewById(R.id.txtDescription);

        if (zodiacSign != null) {
            txtTitle.setText(zodiacSign.getTitle());
            txtPeriod.setText(zodiacSign.getPeriod());
            txtDescription.setText(zodiacSign.getDescription());
        }

        return view;
    }
}
