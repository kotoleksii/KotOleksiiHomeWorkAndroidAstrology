package com.example.astrologyreferencebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ZodiacAdapter extends BaseAdapter {
    Context context;
    String[] zodiacSignsNames;
    int[] images;

    LayoutInflater inflater;

    public ZodiacAdapter(Context context, String[] zodiacSignsNames, int[] images) {
        this.context = context;
        this.zodiacSignsNames = zodiacSignsNames;
        this.images = images;
    }

    @Override
    public int getCount() {
        return zodiacSignsNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null)
            view = inflater.inflate(R.layout.zodiac_grid_item, null);

        ImageView imgLogo = view.findViewById(R.id.imgItem);
        TextView txtTitle = view.findViewById(R.id.txtItemTitle);

        imgLogo.setImageResource(images[position]);
        txtTitle.setText(zodiacSignsNames[position]);

        return view;
    }
}
