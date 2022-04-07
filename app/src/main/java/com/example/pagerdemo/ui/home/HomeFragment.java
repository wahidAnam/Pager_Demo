package com.example.pagerdemo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.pagerdemo.DemoPagerAdapter;
import com.example.pagerdemo.R;
import com.example.pagerdemo.databinding.FragmentHomeBinding;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        ViewPager pager = view.findViewById(R.id.pager);
        DemoPagerAdapter pagerAdapter = new DemoPagerAdapter(8);
        pager.setAdapter(pagerAdapter);

        ScrollingPagerIndicator pagerIndicator = view.findViewById(R.id.pager_indicator);
        pagerIndicator.attachToPager(pager);
    return view;
    }
}