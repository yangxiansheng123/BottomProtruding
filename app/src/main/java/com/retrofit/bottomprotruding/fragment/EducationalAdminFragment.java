package com.retrofit.bottomprotruding.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.retrofit.bottomprotruding.R;


/**
 * 教务
 *
 * @author yang
 */
public class EducationalAdminFragment extends Fragment {


    protected View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_educational_admin, container, false);
        return rootView;
    }


}
