
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class Epub implements Parcelable
{

    @Json(name = "isAvailable")
    private Boolean isAvailable;
    @Json(name = "downloadLink")
    private String downloadLink;
    public final static Creator<Epub> CREATOR = new Creator<Epub>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Epub createFromParcel(Parcel in) {
            return new Epub(in);
        }

        public Epub[] newArray(int size) {
            return (new Epub[size]);
        }

    }
    ;

    protected Epub(Parcel in) {
        this.isAvailable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.downloadLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Epub() {
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
