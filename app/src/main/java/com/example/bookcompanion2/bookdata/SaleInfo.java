
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class SaleInfo implements Parcelable
{

    @Json(name = "country")
    private String country;
    @Json(name = "saleability")
    private String saleability;
    @Json(name = "isEbook")
    private Boolean isEbook;
    @Json(name = "buyLink")
    private String buyLink;
    public final static Creator<SaleInfo> CREATOR = new Creator<SaleInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SaleInfo createFromParcel(Parcel in) {
            return new SaleInfo(in);
        }

        public SaleInfo[] newArray(int size) {
            return (new SaleInfo[size]);
        }

    }
    ;

    protected SaleInfo(Parcel in) {
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.saleability = ((String) in.readValue((String.class.getClassLoader())));
        this.isEbook = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.buyLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public SaleInfo() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(country);
        dest.writeValue(saleability);
        dest.writeValue(isEbook);
        dest.writeValue(buyLink);
    }

    public int describeContents() {
        return  0;
    }

}
