package com.jmurray.android.namemanglerrevenge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jmurray.android.namemanglerrevenge.databinding.FragmentMangleBinding;

public class MangleFragment extends Fragment {
//    private Button mReset;
//    private Button mMangle;
//    private TextView mMangledName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.fragment_mangle, container, false);
//        mReset = (Button) view.findViewById(R.id.reset_button);
//        mReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getActivity().finish();
//            }
//        });
//
//        mMangledName = (TextView) view.findViewById(R.id.name_mangled);
//
//        mMangle = (Button) view.findViewById(R.id.remangle_button);
//        mMangle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mMangledName.setText("test");
//            }
//        });
//
        FragmentMangleBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mangle, container, false);
        binding.setViewModel(new NameViewModel(getArguments().getString("firstName"), getArguments().getBoolean("isNice")));

        return binding.getRoot();
    }

}
