package com.jmurray.android.namemanglerrevenge;

import java.util.Random;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameMangler {
    private static String[] mNiceNames;
    private static String[] mRudeNames;
    private String mMangledName;
    private String mFirstName;
    private boolean mIsNice;

    public NameMangler(String name, boolean isNice) {
        mFirstName = name;
        mIsNice = isNice;
        mNiceNames = new String[]{"Magnificent", "Awesome", "Special", "Splendid","Majestic"};
        mRudeNames = new String[]{"Arseface", "Moron", "Fool", "Imbecile","Nincompoop"};
    }

    public String getMangledName(){

        Random rand = new Random();

        if(mIsNice) {
            mMangledName = mNiceNames[rand.nextInt(mNiceNames.length)];
        } else {
            mMangledName = mRudeNames[rand.nextInt(mRudeNames.length)];
        }
        return mMangledName;
    }

}
