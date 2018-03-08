package com.alfianyusufabdullah.alquranq.ui.Splashscreen;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.alfianyusufabdullah.alquranq.base.BaseActivity;
import com.alfianyusufabdullah.alquranq.R;
import com.alfianyusufabdullah.alquranq.ui.ListSurah.ListSurahActivity;
import com.alfianyusufabdullah.alquranq.utils.PreferenceApp;

import butterknife.BindView;

public class SplashscreenActivity extends BaseActivity<SplashscreenPresenter> implements SplashscreenView {

    @BindView(R.id.layoutLoadingInfo)
    LinearLayout mLayoutLoadingInfo;

    @BindView(R.id.progressInfo)
    ProgressBar mProgressInfo;

    @Override
    public SplashscreenPresenter initPresenter() {
        return new SplashscreenPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        if (PreferenceApp.isFirstLaunch()) {
            mPresenter.startPrepareData();
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(ListSurahActivity.class);
                    finish();
                }
            }, 3000);
        }
    }

    @Override
    public void onPrepare() {
        mLayoutLoadingInfo.setVisibility(View.VISIBLE);
    }

    @Override
    public void onProgress(int progress) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            mProgressInfo.setProgress(progress, true);
        } else {
            mProgressInfo.setProgress(progress);
        }
    }

    @Override
    public void onSuccess() {
        PreferenceApp.hasFirstLaunch();
        startActivity(ListSurahActivity.class);
        finish();
    }
}
