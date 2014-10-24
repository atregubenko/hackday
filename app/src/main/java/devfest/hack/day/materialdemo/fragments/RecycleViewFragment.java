package devfest.hack.day.materialdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import devfest.hack.day.materialdemo.CustomItem;
import devfest.hack.day.materialdemo.R;
import devfest.hack.day.materialdemo.adapters.CustomAdapter;

/**
 * Created by nnet on 24.10.14.
 */
public class RecycleViewFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private CustomAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_recycle, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(container.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //        // specify an adapter (see also next example)
        List<CustomItem> myDataset = new ArrayList<CustomItem>();
        myDataset.add(new CustomItem(R.drawable.ic_cast_grey600_48dp, "Детский мир", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_computer_grey600_48dp, "Недвижимость", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_desktop_mac_grey600_48dp, "Транспорт", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_desktop_windows_grey600_48dp, "Работа", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_headset_grey600_48dp, "Животные", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_headset_mic_grey600_36dp, "Дом и сад", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_cast_grey600_48dp, "Детский мир", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_keyboard_voice_grey600_48dp, "Недвижимость", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_keyboard_alt_grey600_48dp, "Транспорт", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_keyboard_hide_grey600_36dp, "Работа", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.ic_headset_grey600_48dp, "Животные", "999 обьялений"));
        myDataset.add(new CustomItem(R.drawable.action_add_photo, "Дом и сад", "999 обьялений"));
        mAdapter = new CustomAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        mRecyclerView.setItemAnimator(itemAnimator);
    }
}
