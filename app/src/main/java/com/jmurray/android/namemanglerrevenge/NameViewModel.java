package com.jmurray.android.namemanglerrevenge;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.view.View;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameViewModel extends BaseObservable{
    private NameMangler mNM;
    private String mName;
    private boolean mIsNice;
    private Activity mActivity;

    public NameViewModel(String name, boolean isNice, Activity activity) {
        mName = name;
        mIsNice = isNice;
        mActivity = activity;
        mNM = new NameMangler(name);
    }

    public String getMangledName() {
        return mNM.getMangleFullName(mIsNice);
    }

    public String handleMangleClick() {
        notifyChange();
        return "OK";
    }

    public String handleResetClick() {
        mActivity.finish();
//        call finish() here
        return "OK";
    }

}
