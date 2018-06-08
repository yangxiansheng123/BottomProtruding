package com.retrofit.bottomprotruding;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.retrofit.bottomprotruding.fragment.AnalysisFragment;
import com.retrofit.bottomprotruding.fragment.DailyFragment;
import com.retrofit.bottomprotruding.fragment.EducationalAdminFragment;
import com.retrofit.bottomprotruding.fragment.FinanceFragment;
import com.retrofit.bottomprotruding.fragment.MeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yang
 */
class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    private static String homepage = "mAnalysisFragment";
    protected TextView tvProtruding;
    protected ImageView imgProtruding;

    /**
     * 创建一个集合，存储碎片
     */
    private List<Fragment> mFragments = new ArrayList<Fragment>();
    private AnalysisFragment mAnalysisFragment;
    private EducationalAdminFragment mEducationalAdminFragment;
    private DailyFragment mDailyFragment;
    private FinanceFragment mFinanceFragment;
    private MeFragment mMeFragment;

    private FragmentManager fm;
    FragmentTransaction transaction;
    private RadioGroup mRadioButtonRg;
    private FragmentTransaction transaction1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            mAnalysisFragment = new AnalysisFragment();
            fragmentManager.beginTransaction().replace(R.id.fl, mAnalysisFragment, homepage).commit();
        }
    }


    /**
     * 初始化控件
     */
    private void initView() {
        mRadioButtonRg = (RadioGroup) findViewById(R.id.rg_oper);
        mRadioButtonRg.setOnCheckedChangeListener(this);
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        mAnalysisFragment = (AnalysisFragment) fm.findFragmentByTag(homepage);
        mEducationalAdminFragment = (EducationalAdminFragment) fm.findFragmentByTag("mEducationalAdminFragment");
        mDailyFragment = (DailyFragment) fm.findFragmentByTag("mDailyFragment");
        mFinanceFragment = (FinanceFragment) fm.findFragmentByTag("mFinanceFragment");
        mMeFragment = (MeFragment) fm.findFragmentByTag("mMeFragment");
        imgProtruding = (ImageView) findViewById(R.id.img_protruding);
    }


    /**
     * tab切换事件处理
     *
     * @param group
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        transaction1 = fm.beginTransaction();
        if (mAnalysisFragment != null) {
            transaction1.hide(mAnalysisFragment);
        }
        if (mEducationalAdminFragment != null) {
            transaction1.hide(mEducationalAdminFragment);
        }
        if (mDailyFragment != null) {
            transaction1.hide(mDailyFragment);
        }
        if (mFinanceFragment != null) {
            transaction1.hide(mFinanceFragment);
        }
        if (mMeFragment != null) {
            transaction1.hide(mMeFragment);
        }
        if (checkedId == R.id.rd_analysis) {
            if (mAnalysisFragment == null) {
                mAnalysisFragment = new AnalysisFragment();
                transaction1.add(R.id.fl, mAnalysisFragment, homepage);
            } else {
                transaction1.show(mAnalysisFragment);
            }
            imgProtruding.setImageResource(R.mipmap.day_protruding_false);

        } else if (checkedId == R.id.rd_educationadmin) {
            if (mEducationalAdminFragment == null) {
                mEducationalAdminFragment = new EducationalAdminFragment();
                transaction1.add(R.id.fl, mEducationalAdminFragment, "mEducationalAdminFragment");
            } else {
                transaction1.show(mEducationalAdminFragment);
            }
            imgProtruding.setImageResource(R.mipmap.day_protruding_false);

        } else if (checkedId == R.id.rd_daily) {
            if (mDailyFragment == null) {
                mDailyFragment = new DailyFragment();
                transaction1.add(R.id.fl, mDailyFragment, "mDailyFragment");
            } else {
                transaction1.show(mDailyFragment);
            }
            imgProtruding.setImageResource(R.mipmap.day_protruding_true);

        } else if (checkedId == R.id.rd_finance) {
            if (mFinanceFragment == null) {
                mFinanceFragment = new FinanceFragment();
                transaction1.add(R.id.fl, mFinanceFragment, "mFinanceFragment");
            } else {
                transaction1.show(mFinanceFragment);
            }
            imgProtruding.setImageResource(R.mipmap.day_protruding_false);

        } else if (checkedId == R.id.rd_me) {
            if (mMeFragment == null) {
                mMeFragment = new MeFragment();
                transaction1.add(R.id.fl, mMeFragment, "mMeFragment");
            } else {
                transaction1.show(mMeFragment);
            }
            imgProtruding.setImageResource(R.mipmap.day_protruding_false);

        }
        transaction1.commit();
    }


}
