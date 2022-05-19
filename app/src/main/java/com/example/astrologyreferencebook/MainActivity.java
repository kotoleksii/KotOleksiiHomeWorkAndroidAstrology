package com.example.astrologyreferencebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.astrologyreferencebook.models.ZodiacSign;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZodiacAdapter adapterZodiac = new ZodiacAdapter(
                    this,
                ZodiacSign.getZodiacSignsNames(),
            ZodiacSign.getZodiacSignsImages()
        );

        GridView gridViewZodiacList = findViewById(R.id.grdViewZodiacList);
        gridViewZodiacList.setAdapter(adapterZodiac);

        gridViewZodiacList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle args = new Bundle();
                args.putSerializable("zodiacSignList", ZodiacSign.getZodiacSignsList().get(position));

                ZodiacFragment zodiacInfoFragment = new ZodiacFragment();
                zodiacInfoFragment.setArguments(args);

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frgContainerView, zodiacInfoFragment)
                        .commit();
            }
        });
    }
}