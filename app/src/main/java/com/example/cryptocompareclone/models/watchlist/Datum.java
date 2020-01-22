package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Datum implements Serializable, Parcelable {

    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo coinInfo;
    @SerializedName("RAW")
    @Expose
    private RAW rAW;
    @SerializedName("DISPLAY")
    @Expose
    private DISPLAY dISPLAY;
    private final static long serialVersionUID = -2144335145248225348L;

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

    public RAW getRAW() {
        return rAW;
    }

    public void setRAW(RAW rAW) {
        this.rAW = rAW;
    }

    public DISPLAY getDISPLAY() {
        return dISPLAY;
    }

    public void setDISPLAY(DISPLAY dISPLAY) {
        this.dISPLAY = dISPLAY;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.coinInfo, flags);
        dest.writeSerializable(this.rAW);
        dest.writeSerializable(this.dISPLAY);
    }

    public Datum() {
    }

    protected Datum(Parcel in) {
        this.coinInfo = in.readParcelable(CoinInfo.class.getClassLoader());
        this.rAW = (RAW) in.readSerializable();
        this.dISPLAY = (DISPLAY) in.readSerializable();
    }

    public static final Parcelable.Creator<Datum> CREATOR = new Parcelable.Creator<Datum>() {
        @Override
        public Datum createFromParcel(Parcel source) {
            return new Datum(source);
        }

        @Override
        public Datum[] newArray(int size) {
            return new Datum[size];
        }
    };
}
