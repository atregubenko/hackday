package devfest.hack.day.materialdemo.adapters;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import devfest.hack.day.materialdemo.CustomItem;
import devfest.hack.day.materialdemo.R;

/**
 * Created by nnet on 24.10.14.
 */
// See
// https://developer.android.com/training/material/lists-cards.html
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<CustomItem> mDataset;

    public CustomAdapter(List<CustomItem> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {
        viewHolder.icon.setImageResource(mDataset.get(position).getResId());
        viewHolder.title.setText(mDataset.get(position).getTitle());
        viewHolder.count.setText(mDataset.get(position).getCount());

//        Palette.generateAsync(((BitmapDrawable)viewHolder.icon.getDrawable()).getBitmap(),
//                new Palette.PaletteAsyncListener() {
//                    @Override
//                    public void onGenerated(Palette palette) {
//                        Palette.Swatch vibrant =
//                                palette.getVibrantSwatch();
////                        if (swatch != null) {
//                            // If we have a vibrant color
//                            // update the title TextView
//                            viewHolder.title.setBackgroundColor(
//                                    vibrant.getRgb());
//                            viewHolder.title.setTextColor(
//                                    vibrant.getTitleTextColor());
////                        }
//                    }
//                });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView icon;
        public TextView title;
        public TextView count;
        public ViewHolder(View v) {
            super(v);
            icon = (ImageView) v.findViewById(R.id.icon);
            title = (TextView) v.findViewById(R.id.title);
            count = (TextView) v.findViewById(R.id.count);
        }
    }
}
