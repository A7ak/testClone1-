package com.example.cryptocompareclone.models.news;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LatestNewsArticleResponsePage implements Serializable {

    @SerializedName("Type")
    @Expose
    private Integer type;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Promoted")
    @Expose
    private List<Object> promoted = null;
    @SerializedName("Data")
    @Expose
    private List<News> data = null;
    @SerializedName("RateLimit")
    @Expose
    private RateLimit rateLimit;
    @SerializedName("HasWarning")
    @Expose
    private Boolean hasWarning;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getPromoted() {
        return promoted;
    }

    public void setPromoted(List<Object> promoted) {
        this.promoted = promoted;
    }

    public List<News> getData() {
        return data;
    }

    public void setData(List<News> data) {
        this.data = data;
    }

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public Boolean getHasWarning() {
        return hasWarning;
    }

    public void setHasWarning(Boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

}
