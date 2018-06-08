package com.retrofit.bottomprotruding.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.retrofit.bottomprotruding.R;


/**
 * 我的
 */
public class MeFragment extends Fragment {


    protected View rootView;
    protected FrameLayout tvEditInfo;
    protected TextView tvSettingMangment;
    protected TextView tvModifyPw;
    protected TextView tvOperationGuide;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_me, container, false);
        return rootView;
    }



}
