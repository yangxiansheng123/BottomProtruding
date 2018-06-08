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
 * 版权：艺魔方公司 版权所有
 *
 * @author yang
 * 版本：1.0
 * 创建日期：2018/5/3
 * 描述：DailyFragment 日常
 */
public class DailyFragment extends Fragment  {


    protected View rootView;
    protected TextView tvCollegeEntry;
    protected TextView tvCollegeDistribution;
    protected TextView tvRenewaReminding;
    protected TextView tvAuditionsArrangement;
    protected TextView tvWaitForClass;
    protected TextView tvStudentAttendance;
    protected TextView tvCreateAJob;
    protected TextView tvToBeCorrected;
    protected TextView tvMyHomework;
    protected TextView tvCollegeFollowUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_daily, container, false);
        return rootView;
    }

}
