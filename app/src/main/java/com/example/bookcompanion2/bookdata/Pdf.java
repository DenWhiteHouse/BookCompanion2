
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class Pdf implements Parcelable
{

    @Json(name = "isAvailable")
    private Boolean isAvailable;
    @Json(name = "downloadLink")
    private String downloadLink;
    public final static Creator<Pdf> CREATOR = new Creator<Pdf>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pdf createFromParcel(Parcel in) {
            return new Pdf(in);
        }

        public Pdf[] newArray(int size) {
            return (new Pdf[size]);
        }

    }
    ;

    protected Pdf(Parcel in) {
        this.isAvailable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.downloadLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Pdf() {
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isAvailable);
        dest.writeValue(downloadLink);
    }

    public int describeContents() {
        return  0;
    }

}
