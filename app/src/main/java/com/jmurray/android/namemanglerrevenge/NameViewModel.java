package com.jmurray.android.namemanglerrevenge;

import android.databinding.BaseObservable;
import android.view.View;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameViewModel extends BaseObservable{
    private NameMangler mNM;
    private String mName;
    private boolean mIsNice;

    public NameViewModel(String name, boolean isNice) {
        mName = name;
        mIsNice = isNice;
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
//        call finish() here
        return "OK";
    }

}
