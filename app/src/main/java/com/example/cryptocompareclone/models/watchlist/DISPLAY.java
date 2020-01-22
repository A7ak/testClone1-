package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DISPLAY implements Serializable, Parcelable {

    @SerializedName("USD")
    @Expose
    private USD_ uSD;
    private final static long serialVersionUID = -2748425346428583803L;

    public USD_ getUSD() {
        return uSD;
    }

    public void setUSD(USD_ uSD) {
        this.uSD = uSD;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.uSD);
    }

    public DISPLAY() {
    }

    protected DISPLAY(Parcel in) {
        this.uSD = (USD_) in.readSerializable();
    }

    public static final Parcelable.Creator<DISPLAY> CREATOR = new Parcelable.Creator<DISPLAY>() {
        @Override
        public DISPLAY createFromParcel(Parcel source) {
            return new DISPLAY(source);
        }

        @Override
        public DISPLAY[] newArray(int size) {
            return new DISPLAY[size];
        }
    };
}
