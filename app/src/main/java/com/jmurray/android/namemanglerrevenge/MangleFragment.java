package com.jmurray.android.namemanglerrevenge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jmurray.android.namemanglerrevenge.databinding.FragmentMangleBinding;

public class MangleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentMangleBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mangle, container, false);
        binding.setViewModel(new NameViewModel(getArguments().getString("firstName"), getArguments().getBoolean("isNice")));

        return binding.getRoot();
    }

}
