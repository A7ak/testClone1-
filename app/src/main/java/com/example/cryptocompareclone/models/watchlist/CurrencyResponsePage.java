package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyResponsePage implements Serializable, Parcelable {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Type")
    @Expose
    private Integer type;
     @SerializedName("SponsoredData")
     @Expose
     private List<Object> sponsoredData = null;
     @SerializedName("Data")
     @Expose
     private List<Datum> data = null;
   /*  @SerializedName("RateLimit")
     @Expose*/
    /* private RateLimit rateLimit;
     @SerializedName("HasWarning")
     @Expose*/
/*
     private Boolean hasWarning;
*/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Object> getSponsoredData() {
        return sponsoredData;
    }

    public void setSponsoredData(List<Object> sponsoredData) {
        this.sponsoredData = sponsoredData;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

/*    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }*/

  /*  public Boolean getHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(Boolean hasWarning) {
        this.hasWarning = hasWarning;
    }*/

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.message);
        dest.writeValue(this.type);
        dest.writeList(this.sponsoredData);
        dest.writeList(this.data);
    }

    public CurrencyResponsePage() {
    }

    protected CurrencyResponsePage(Parcel in) {
        this.message = in.readString();
        this.type = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sponsoredData = new ArrayList<Object>();
        in.readList(this.sponsoredData, Object.class.getClassLoader());
        this.data = new ArrayList<Datum>();
        in.readList(this.data, Datum.class.getClassLoader());
    }

    public static final Parcelable.Creator<CurrencyResponsePage> CREATOR = new Parcelable.Creator<CurrencyResponsePage>() {
        @Override
        public CurrencyResponsePage createFromParcel(Parcel source) {
            return new CurrencyResponsePage(source);
        }

        @Override
        public CurrencyResponsePage[] newArray(int size) {
            return new CurrencyResponsePage[size];
        }
    };
}
