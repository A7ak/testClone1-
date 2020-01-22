package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class RateLimit implements Serializable, Parcelable {

    private final static long serialVersionUID = 6345198690211220045L;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public RateLimit() {
    }

    protected RateLimit(Parcel in) {
    }

    public static final Parcelable.Creator<RateLimit> CREATOR = new Parcelable.Creator<RateLimit>() {
        @Override
        public RateLimit createFromParcel(Parcel source) {
            return new RateLimit(source);
        }

        @Override
        public RateLimit[] newArray(int size) {
            return new RateLimit[size];
        }
    };
}
