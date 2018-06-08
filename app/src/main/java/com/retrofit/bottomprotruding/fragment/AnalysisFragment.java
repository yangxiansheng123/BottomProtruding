package com.retrofit.bottomprotruding.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.retrofit.bottomprotruding.R;


/**
 * 分析
 *
 * @author yangpf
 */
public class AnalysisFragment extends Fragment {


    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_analysis, container, false);
        return rootView;
    }


}
