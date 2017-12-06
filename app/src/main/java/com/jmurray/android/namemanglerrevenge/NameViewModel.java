package com.jmurray.android.namemanglerrevenge;

import android.widget.TextView;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameViewModel {
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

}
