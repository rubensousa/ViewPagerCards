package com.github.rubensousa.viewpagercards;


import android.widget.Button;

public class CardItem {

    private int mTextResource;
    private int mTitleResource;
    //
    protected Button mButton;

    public CardItem(int title, int text) {
        mTitleResource = title;
        mTextResource = text;
    }

    public int getText() {
        return mTextResource;
    }

    public int getTitle() {
        return mTitleResource;
    }


}
