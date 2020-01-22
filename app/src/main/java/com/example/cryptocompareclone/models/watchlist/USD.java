package com.example.cryptocompareclone.models.watchlist;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class USD implements Serializable, Parcelable {

    @SerializedName("TYPE")
    @Expose
    private String tYPE;
    @SerializedName("MARKET")
    @Expose
    private String mARKET;
    @SerializedName("FROMSYMBOL")
    @Expose
    private String fROMSYMBOL;
    @SerializedName("TOSYMBOL")
    @Expose
    private String tOSYMBOL;
    @SerializedName("FLAGS")
    @Expose
    private String fLAGS;
    @SerializedName("PRICE")
    @Expose
    private Float pRICE;
    @SerializedName("LASTUPDATE")
    @Expose
    private Integer lASTUPDATE;
    @SerializedName("MEDIAN")
    @Expose
    private Float mEDIAN;
    @SerializedName("LASTVOLUME")
    @Expose
    private Float lASTVOLUME;
    @SerializedName("LASTVOLUMETO")
    @Expose
    private Float lASTVOLUMETO;
    @SerializedName("LASTTRADEID")
    @Expose
    private String lASTTRADEID;
    @SerializedName("VOLUMEDAY")
    @Expose
    private Float vOLUMEDAY;
    @SerializedName("VOLUMEDAYTO")
    @Expose
    private Float vOLUMEDAYTO;
    @SerializedName("VOLUME24HOUR")
    @Expose
    private Float vOLUME24HOUR;
    @SerializedName("VOLUME24HOURTO")
    @Expose
    private Float vOLUME24HOURTO;
    @SerializedName("OPENDAY")
    @Expose
    private Float oPENDAY;
    @SerializedName("HIGHDAY")
    @Expose
    private Float hIGHDAY;
    @SerializedName("LOWDAY")
    @Expose
    private Float lOWDAY;
    @SerializedName("OPEN24HOUR")
    @Expose
    private Float oPEN24HOUR;
    @SerializedName("HIGH24HOUR")
    @Expose
    private Float hIGH24HOUR;
    @SerializedName("LOW24HOUR")
    @Expose
    private Float lOW24HOUR;
    @SerializedName("LASTMARKET")
    @Expose
    private String lASTMARKET;
    @SerializedName("VOLUMEHOUR")
    @Expose
    private Float vOLUMEHOUR;
    @SerializedName("VOLUMEHOURTO")
    @Expose
    private Float vOLUMEHOURTO;
    @SerializedName("OPENHOUR")
    @Expose
    private Float oPENHOUR;
    @SerializedName("HIGHHOUR")
    @Expose
    private Float hIGHHOUR;
    @SerializedName("LOWHOUR")
    @Expose
    private Float lOWHOUR;
    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private Float tOPTIERVOLUME24HOUR;
    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private Float tOPTIERVOLUME24HOURTO;
    @SerializedName("CHANGE24HOUR")
    @Expose
    private Float cHANGE24HOUR;
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private Float cHANGEPCT24HOUR;
    @SerializedName("CHANGEDAY")
    @Expose
    private Float cHANGEDAY;
    @SerializedName("CHANGEPCTDAY")
    @Expose
    private Float cHANGEPCTDAY;
    @SerializedName("CHANGEHOUR")
    @Expose
    private Float cHANGEHOUR;
    @SerializedName("CHANGEPCTHOUR")
    @Expose
    private Float cHANGEPCTHOUR;
    @SerializedName("SUPPLY")
    @Expose
    private Float sUPPLY;
    @SerializedName("MKTCAP")
    @Expose
    private Float mKTCAP;
    @SerializedName("TOTALVOLUME24H")
    @Expose
    private Float tOTALVOLUME24H;
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private Float tOTALVOLUME24HTO;
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private Float tOTALTOPTIERVOLUME24H;
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private Float tOTALTOPTIERVOLUME24HTO;
    @SerializedName("IMAGEURL")
    @Expose
    private String iMAGEURL;
    @SerializedName("CONVERSIONTYPE")
    @Expose
    private String cONVERSIONTYPE;
  /*  @SerializedName("CONVERSIONSYMBOL")
    @Expose
    private String cONVERSIONSYMBOL;*/


    public String getTYPE() {
        return tYPE;
    }

    public void setTYPE(String tYPE) {
        this.tYPE = tYPE;
    }

    public String getMARKET() {
        return mARKET;
    }

    public void setMARKET(String mARKET) {
        this.mARKET = mARKET;
    }

    public String getFROMSYMBOL() {
        return fROMSYMBOL;
    }

    public void setFROMSYMBOL(String fROMSYMBOL) {
        this.fROMSYMBOL = fROMSYMBOL;
    }

    public String getTOSYMBOL() {
        return tOSYMBOL;
    }

    public void setTOSYMBOL(String tOSYMBOL) {
        this.tOSYMBOL = tOSYMBOL;
    }

    public String getFLAGS() {
        return fLAGS;
    }

    public void setFLAGS(String fLAGS) {
        this.fLAGS = fLAGS;
    }

    public Float getPRICE() {
        return pRICE;
    }

    public void setPRICE(Float pRICE) {
        this.pRICE = pRICE;
    }

    public Integer getLASTUPDATE() {
        return lASTUPDATE;
    }

    public void setLASTUPDATE(Integer lASTUPDATE) {
        this.lASTUPDATE = lASTUPDATE;
    }

    public Float getMEDIAN() {
        return mEDIAN;
    }

    public void setMEDIAN(Float mEDIAN) {
        this.mEDIAN = mEDIAN;
    }

    public Float getLASTVOLUME() {
        return lASTVOLUME;
    }

    public void setLASTVOLUME(Float lASTVOLUME) {
        this.lASTVOLUME = lASTVOLUME;
    }

    public Float getLASTVOLUMETO() {
        return lASTVOLUMETO;
    }

    public void setLASTVOLUMETO(Float lASTVOLUMETO) {
        this.lASTVOLUMETO = lASTVOLUMETO;
    }

    public String getLASTTRADEID() {
        return lASTTRADEID;
    }

    public void setLASTTRADEID(String lASTTRADEID) {
        this.lASTTRADEID = lASTTRADEID;
    }

    public Float getVOLUMEDAY() {
        return vOLUMEDAY;
    }

    public void setVOLUMEDAY(Float vOLUMEDAY) {
        this.vOLUMEDAY = vOLUMEDAY;
    }

    public Float getVOLUMEDAYTO() {
        return vOLUMEDAYTO;
    }

    public void setVOLUMEDAYTO(Float vOLUMEDAYTO) {
        this.vOLUMEDAYTO = vOLUMEDAYTO;
    }

    public Float getVOLUME24HOUR() {
        return vOLUME24HOUR;
    }

    public void setVOLUME24HOUR(Float vOLUME24HOUR) {
        this.vOLUME24HOUR = vOLUME24HOUR;
    }

    public Float getVOLUME24HOURTO() {
        return vOLUME24HOURTO;
    }

    public void setVOLUME24HOURTO(Float vOLUME24HOURTO) {
        this.vOLUME24HOURTO = vOLUME24HOURTO;
    }

    public Float getOPENDAY() {
        return oPENDAY;
    }

    public void setOPENDAY(Float oPENDAY) {
        this.oPENDAY = oPENDAY;
    }

    public Float getHIGHDAY() {
        return hIGHDAY;
    }

    public void setHIGHDAY(Float hIGHDAY) {
        this.hIGHDAY = hIGHDAY;
    }

    public Float getLOWDAY() {
        return lOWDAY;
    }

    public void setLOWDAY(Float lOWDAY) {
        this.lOWDAY = lOWDAY;
    }

    public Float getOPEN24HOUR() {
        return oPEN24HOUR;
    }

    public void setOPEN24HOUR(Float oPEN24HOUR) {
        this.oPEN24HOUR = oPEN24HOUR;
    }

    public Float getHIGH24HOUR() {
        return hIGH24HOUR;
    }

    public void setHIGH24HOUR(Float hIGH24HOUR) {
        this.hIGH24HOUR = hIGH24HOUR;
    }

    public Float getLOW24HOUR() {
        return lOW24HOUR;
    }

    public void setLOW24HOUR(Float lOW24HOUR) {
        this.lOW24HOUR = lOW24HOUR;
    }

    public String getLASTMARKET() {
        return lASTMARKET;
    }

    public void setLASTMARKET(String lASTMARKET) {
        this.lASTMARKET = lASTMARKET;
    }

    public Float getVOLUMEHOUR() {
        return vOLUMEHOUR;
    }

    public void setVOLUMEHOUR(Float vOLUMEHOUR) {
        this.vOLUMEHOUR = vOLUMEHOUR;
    }

    public Float getVOLUMEHOURTO() {
        return vOLUMEHOURTO;
    }

    public void setVOLUMEHOURTO(Float vOLUMEHOURTO) {
        this.vOLUMEHOURTO = vOLUMEHOURTO;
    }

    public Float getOPENHOUR() {
        return oPENHOUR;
    }

    public void setOPENHOUR(Float oPENHOUR) {
        this.oPENHOUR = oPENHOUR;
    }

    public Float getHIGHHOUR() {
        return hIGHHOUR;
    }

    public void setHIGHHOUR(Float hIGHHOUR) {
        this.hIGHHOUR = hIGHHOUR;
    }

    public Float getLOWHOUR() {
        return lOWHOUR;
    }

    public void setLOWHOUR(Float lOWHOUR) {
        this.lOWHOUR = lOWHOUR;
    }

    public Float getTOPTIERVOLUME24HOUR() {
        return tOPTIERVOLUME24HOUR;
    }

    public void setTOPTIERVOLUME24HOUR(Float tOPTIERVOLUME24HOUR) {
        this.tOPTIERVOLUME24HOUR = tOPTIERVOLUME24HOUR;
    }

    public Float getTOPTIERVOLUME24HOURTO() {
        return tOPTIERVOLUME24HOURTO;
    }

    public void setTOPTIERVOLUME24HOURTO(Float tOPTIERVOLUME24HOURTO) {
        this.tOPTIERVOLUME24HOURTO = tOPTIERVOLUME24HOURTO;
    }

    public Float getCHANGE24HOUR() {
        return cHANGE24HOUR;
    }

    public void setCHANGE24HOUR(Float cHANGE24HOUR) {
        this.cHANGE24HOUR = cHANGE24HOUR;
    }

    public Float getCHANGEPCT24HOUR() {
        return cHANGEPCT24HOUR;
    }

    public void setCHANGEPCT24HOUR(Float cHANGEPCT24HOUR) {
        this.cHANGEPCT24HOUR = cHANGEPCT24HOUR;
    }

    public Float getCHANGEDAY() {
        return cHANGEDAY;
    }

    public void setCHANGEDAY(Float cHANGEDAY) {
        this.cHANGEDAY = cHANGEDAY;
    }

    public Float getCHANGEPCTDAY() {
        return cHANGEPCTDAY;
    }

    public void setCHANGEPCTDAY(Float cHANGEPCTDAY) {
        this.cHANGEPCTDAY = cHANGEPCTDAY;
    }

    public Float getCHANGEHOUR() {
        return cHANGEHOUR;
    }

    public void setCHANGEHOUR(Float cHANGEHOUR) {
        this.cHANGEHOUR = cHANGEHOUR;
    }

    public Float getCHANGEPCTHOUR() {
        return cHANGEPCTHOUR;
    }

    public void setCHANGEPCTHOUR(Float cHANGEPCTHOUR) {
        this.cHANGEPCTHOUR = cHANGEPCTHOUR;
    }

    public Float getSUPPLY() {
        return sUPPLY;
    }

    public void setSUPPLY(Float sUPPLY) {
        this.sUPPLY = sUPPLY;
    }

    public Float getMKTCAP() {
        return mKTCAP;
    }

    public void setMKTCAP(Float mKTCAP) {
        this.mKTCAP = mKTCAP;
    }

    public Float getTOTALVOLUME24H() {
        return tOTALVOLUME24H;
    }

    public void setTOTALVOLUME24H(Float tOTALVOLUME24H) {
        this.tOTALVOLUME24H = tOTALVOLUME24H;
    }

    public Float getTOTALVOLUME24HTO() {
        return tOTALVOLUME24HTO;
    }

    public void setTOTALVOLUME24HTO(Float tOTALVOLUME24HTO) {
        this.tOTALVOLUME24HTO = tOTALVOLUME24HTO;
    }

    public Float getTOTALTOPTIERVOLUME24H() {
        return tOTALTOPTIERVOLUME24H;
    }

    public void setTOTALTOPTIERVOLUME24H(Float tOTALTOPTIERVOLUME24H) {
        this.tOTALTOPTIERVOLUME24H = tOTALTOPTIERVOLUME24H;
    }

    public Float getTOTALTOPTIERVOLUME24HTO() {
        return tOTALTOPTIERVOLUME24HTO;
    }

    public void setTOTALTOPTIERVOLUME24HTO(Float tOTALTOPTIERVOLUME24HTO) {
        this.tOTALTOPTIERVOLUME24HTO = tOTALTOPTIERVOLUME24HTO;
    }

    public String getIMAGEURL() {
        return iMAGEURL;
    }

    public void setIMAGEURL(String iMAGEURL) {
        this.iMAGEURL = iMAGEURL;
    }

    public String getCONVERSIONTYPE() {
        return cONVERSIONTYPE;
    }

    public void setCONVERSIONTYPE(String cONVERSIONTYPE) {
        this.cONVERSIONTYPE = cONVERSIONTYPE;
    }

   /* public String getCONVERSIONSYMBOL() {
        return cONVERSIONSYMBOL;
    }

    public void setCONVERSIONSYMBOL(String cONVERSIONSYMBOL) {
        this.cONVERSIONSYMBOL = cONVERSIONSYMBOL;
    }*/

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tYPE);
        dest.writeString(this.mARKET);
        dest.writeString(this.fROMSYMBOL);
        dest.writeString(this.tOSYMBOL);
        dest.writeString(this.fLAGS);
        dest.writeValue(this.pRICE);
        dest.writeValue(this.lASTUPDATE);
        dest.writeValue(this.mEDIAN);
        dest.writeValue(this.lASTVOLUME);
        dest.writeValue(this.lASTVOLUMETO);
        dest.writeString(this.lASTTRADEID);
        dest.writeValue(this.vOLUMEDAY);
        dest.writeValue(this.vOLUMEDAYTO);
        dest.writeValue(this.vOLUME24HOUR);
        dest.writeValue(this.vOLUME24HOURTO);
        dest.writeValue(this.oPENDAY);
        dest.writeValue(this.hIGHDAY);
        dest.writeValue(this.lOWDAY);
        dest.writeValue(this.oPEN24HOUR);
        dest.writeValue(this.hIGH24HOUR);
        dest.writeValue(this.lOW24HOUR);
        dest.writeString(this.lASTMARKET);
        dest.writeValue(this.vOLUMEHOUR);
        dest.writeValue(this.vOLUMEHOURTO);
        dest.writeValue(this.oPENHOUR);
        dest.writeValue(this.hIGHHOUR);
        dest.writeValue(this.lOWHOUR);
        dest.writeValue(this.tOPTIERVOLUME24HOUR);
        dest.writeValue(this.tOPTIERVOLUME24HOURTO);
        dest.writeValue(this.cHANGE24HOUR);
        dest.writeValue(this.cHANGEPCT24HOUR);
        dest.writeValue(this.cHANGEDAY);
        dest.writeValue(this.cHANGEPCTDAY);
        dest.writeValue(this.cHANGEHOUR);
        dest.writeValue(this.cHANGEPCTHOUR);
        dest.writeValue(this.sUPPLY);
        dest.writeValue(this.mKTCAP);
        dest.writeValue(this.tOTALVOLUME24H);
        dest.writeValue(this.tOTALVOLUME24HTO);
        dest.writeValue(this.tOTALTOPTIERVOLUME24H);
        dest.writeValue(this.tOTALTOPTIERVOLUME24HTO);
        dest.writeString(this.iMAGEURL);
        dest.writeString(this.cONVERSIONTYPE);
    }

    public USD() {
    }

    protected USD(Parcel in) {
        this.tYPE = in.readString();
        this.mARKET = in.readString();
        this.fROMSYMBOL = in.readString();
        this.tOSYMBOL = in.readString();
        this.fLAGS = in.readString();
        this.pRICE = (Float) in.readValue(Float.class.getClassLoader());
        this.lASTUPDATE = (Integer) in.readValue(Integer.class.getClassLoader());
        this.mEDIAN = (Float) in.readValue(Float.class.getClassLoader());
        this.lASTVOLUME = (Float) in.readValue(Float.class.getClassLoader());
        this.lASTVOLUMETO = (Float) in.readValue(Float.class.getClassLoader());
        this.lASTTRADEID = in.readString();
        this.vOLUMEDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.vOLUMEDAYTO = (Float) in.readValue(Float.class.getClassLoader());
        this.vOLUME24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.vOLUME24HOURTO = (Float) in.readValue(Float.class.getClassLoader());
        this.oPENDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.hIGHDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.lOWDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.oPEN24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.hIGH24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.lOW24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.lASTMARKET = in.readString();
        this.vOLUMEHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.vOLUMEHOURTO = (Float) in.readValue(Float.class.getClassLoader());
        this.oPENHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.hIGHHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.lOWHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.tOPTIERVOLUME24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.tOPTIERVOLUME24HOURTO = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGE24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGEPCT24HOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGEDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGEPCTDAY = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGEHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.cHANGEPCTHOUR = (Float) in.readValue(Float.class.getClassLoader());
        this.sUPPLY = (Float) in.readValue(Float.class.getClassLoader());
        this.mKTCAP = (Float) in.readValue(Float.class.getClassLoader());
        this.tOTALVOLUME24H = (Float) in.readValue(Float.class.getClassLoader());
        this.tOTALVOLUME24HTO = (Float) in.readValue(Float.class.getClassLoader());
        this.tOTALTOPTIERVOLUME24H = (Float) in.readValue(Float.class.getClassLoader());
        this.tOTALTOPTIERVOLUME24HTO = (Float) in.readValue(Float.class.getClassLoader());
        this.iMAGEURL = in.readString();
        this.cONVERSIONTYPE = in.readString();
    }

    public static final Parcelable.Creator<USD> CREATOR = new Parcelable.Creator<USD>() {
        @Override
        public USD createFromParcel(Parcel source) {
            return new USD(source);
        }

        @Override
        public USD[] newArray(int size) {
            return new USD[size];
        }
    };
}
