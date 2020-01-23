package com.example.cryptocompareclone.models.watchlist_detail.per_minute_data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable, Parcelable
{

    @SerializedName("Aggregated")
    @Expose
    private Boolean aggregated;
    @SerializedName("TimeFrom")
    @Expose
    private Integer timeFrom;
    @SerializedName("TimeTo")
    @Expose
    private Integer timeTo;
    @SerializedName("Data")
    @Expose
    private List<Datum> data = null;
    public final static Creator<Data> CREATOR = new Creator<Data>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
            ;
    private final static long serialVersionUID = 6475086482228578374L;

    protected Data(Parcel in) {
        this.aggregated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.timeFrom = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.timeTo = ((Integer) in.readValue((Integer.class.getClassLoader())));
      //  in.readList(this.data, (com.example.Datum.class.getClassLoader()));
    }

    public Data() {
    }

    public Boolean getAggregated() {
        return aggregated;
    }

    public void setAggregated(Boolean aggregated) {
        this.aggregated = aggregated;
    }

    public Integer getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Integer timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Integer getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Integer timeTo) {
        this.timeTo = timeTo;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aggregated);
        dest.writeValue(timeFrom);
        dest.writeValue(timeTo);
        dest.writeList(data);
    }

    public int describeContents() {
        return 0;
    }

}
