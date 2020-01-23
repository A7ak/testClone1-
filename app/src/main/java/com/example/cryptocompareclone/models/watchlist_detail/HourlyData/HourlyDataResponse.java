package com.example.cryptocompareclone.models.watchlist_detail.HourlyData;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HourlyDataResponse implements Serializable, Parcelable
{

    @SerializedName("Response")
    @Expose
    private String response;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("HasWarning")
    @Expose
    private Boolean hasWarning;
    @SerializedName("Type")
    @Expose
    private Integer type;
    /*@SerializedName("RateLimit")
    @Expose
    private RateLimit rateLimit;*/
    @SerializedName("Data")
    @Expose
    private Data data;
    public final static Creator<HourlyDataResponse> CREATOR = new Creator<HourlyDataResponse>() {


        @SuppressWarnings({
                "unchecked"
        })
        public HourlyDataResponse createFromParcel(Parcel in) {
            return new HourlyDataResponse(in);
        }

        public HourlyDataResponse[] newArray(int size) {
            return (new HourlyDataResponse[size]);
        }

    };


    protected HourlyDataResponse(Parcel in) {
        this.response = ((String) in.readValue((String.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.hasWarning = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.type = ((Integer) in.readValue((Integer.class.getClassLoader())));
//        this.rateLimit = ((RateLimit) in.readValue((RateLimit.class.getClassLoader())));
        this.data = ((Data) in.readValue((Data.class.getClassLoader())));
    }

    public HourlyDataResponse() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(Boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

  /*  public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }*/

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(response);
        dest.writeValue(message);
        dest.writeValue(hasWarning);
        dest.writeValue(type);
//        dest.writeValue(rateLimit);
        dest.writeValue(data);
    }

    public int describeContents() {
        return 0;
    }

}
