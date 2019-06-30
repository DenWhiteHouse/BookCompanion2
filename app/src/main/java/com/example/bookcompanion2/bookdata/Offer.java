
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offer implements Parcelable
{

    @SerializedName("finskyOfferType")
    @Expose
    private Long finskyOfferType;
    @SerializedName("listPrice")
    @Expose
    private ListPrice_ listPrice;
    @SerializedName("retailPrice")
    @Expose
    private RetailPrice_ retailPrice;
    public final static Creator<Offer> CREATOR = new Creator<Offer>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Offer createFromParcel(Parcel in) {
            return new Offer(in);
        }

        public Offer[] newArray(int size) {
            return (new Offer[size]);
        }

    }
    ;

    protected Offer(Parcel in) {
        this.finskyOfferType = ((Long) in.readValue((Long.class.getClassLoader())));
        this.listPrice = ((ListPrice_) in.readValue((ListPrice_.class.getClassLoader())));
        this.retailPrice = ((RetailPrice_) in.readValue((RetailPrice_.class.getClassLoader())));
    }

    public Offer() {
    }

    public Long getFinskyOfferType() {
        return finskyOfferType;
    }

    public void setFinskyOfferType(Long finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
    }

    public ListPrice_ getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice_ listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice_ getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(RetailPrice_ retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(finskyOfferType);
        dest.writeValue(listPrice);
        dest.writeValue(retailPrice);
    }

    public int describeContents() {
        return  0;
    }

}
