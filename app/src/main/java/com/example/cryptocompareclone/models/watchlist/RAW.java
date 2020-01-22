package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RAW implements Serializable, Parcelable {

    @SerializedName("USD")
    @Expose
    private USD uSD;

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
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

    public RAW() {
    }

    protected RAW(Parcel in) {
        this.uSD = (USD) in.readSerializable();
    }

    public static final Parcelable.Creator<RAW> CREATOR = new Parcelable.Creator<RAW>() {
        @Override
        public RAW createFromParcel(Parcel source) {
            return new RAW(source);
        }

        @Override
        public RAW[] newArray(int size) {
            return new RAW[size];
        }
    };
}
