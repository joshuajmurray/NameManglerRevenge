package com.jmurray.android.namemanglerrevenge;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameViewModel {
    private NameMangler mNames;
    private boolean mIsNice;
    private String mName;

    public NameViewModel(String name, boolean isNice) {
        mNames = new NameMangler(name, isNice);
        mIsNice = isNice;
        mName = name;
    }

    public String getLastName() {
        return mName + " " + mNames.getMangledName();
    }
}
