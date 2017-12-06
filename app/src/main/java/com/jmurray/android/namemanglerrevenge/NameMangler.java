package com.jmurray.android.namemanglerrevenge;

import java.util.Random;

/**
 * Created by joshua on 12/5/2017.
 */

public class NameMangler {
    private static String[] mNiceNames;
    private static String[] mRudeNames;
    private String mMangleName;
    private String mFirstName;

    public NameMangler(String name) {
        mFirstName = name;
        mNiceNames = new String[]{"Magnificent", "Awesome", "Special", "Splendid","Majestic"};
        mRudeNames = new String[]{"Arseface", "Moron", "Fool", "Imbecile","Nincompoop"};
    }

    public String getMangleFullName(boolean isNice){

        Random rand = new Random();

        if(isNice) {
            mMangleName = mFirstName + " " + mNiceNames[rand.nextInt(mNiceNames.length)];
        } else {
            mMangleName = mFirstName + " " + mRudeNames[rand.nextInt(mRudeNames.length)];
        }
        return mMangleName;
    }

}
