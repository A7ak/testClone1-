package com.example.cryptocompareclone.models.watchlist_detail.per_minute_data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Datum implements Serializable, Parcelable
{

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("close")
    @Expose
    private Float close;
    @SerializedName("high")
    @Expose
    private Float high;
    @SerializedName("low")
    @Expose
    private Float low;
    @SerializedName("open")
    @Expose
    private Float open;
    @SerializedName("volumefrom")
    @Expose
    private Integer volumefrom;
    @SerializedName("volumeto")
    @Expose
    private Integer volumeto;
    @SerializedName("conversionType")
    @Expose
    private String conversionType;
    @SerializedName("conversionSymbol")
    @Expose
    private String conversionSymbol;
    public final static Creator<Datum> CREATOR = new Creator<Datum>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    }
            ;
    private final static long serialVersionUID = 7721066770011844004L;

    protected Datum(Parcel in) {
        this.time = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.close = ((Float) in.readValue((Float.class.getClassLoader())));
        this.high = ((Float) in.readValue((Float.class.getClassLoader())));
        this.low = ((Float) in.readValue((Float.class.getClassLoader())));
        this.open = ((Float) in.readValue((Float.class.getClassLoader())));
        this.volumefrom = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.volumeto = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.conversionType = ((String) in.readValue((String.class.getClassLoader())));
        this.conversionSymbol = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Datum() {
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Float getClose() {
        return close;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Integer getVolumefrom() {
        return volumefrom;
    }

    public void setVolumefrom(Integer volumefrom) {
        this.volumefrom = volumefrom;
    }

    public Integer getVolumeto() {
        return volumeto;
    }

    public void setVolumeto(Integer volumeto) {
        this.volumeto = volumeto;
    }

    public String getConversionType() {
        return conversionType;
    }

    public void setConversionType(String conversionType) {
        this.conversionType = conversionType;
    }

    public String getConversionSymbol() {
        return conversionSymbol;
    }

    public void setConversionSymbol(String conversionSymbol) {
        this.conversionSymbol = conversionSymbol;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(close);
        dest.writeValue(high);
        dest.writeValue(low);
        dest.writeValue(open);
        dest.writeValue(volumefrom);
        dest.writeValue(volumeto);
        dest.writeValue(conversionType);
        dest.writeValue(conversionSymbol);
    }

    public int describeContents() {
        return 0;
    }

}
