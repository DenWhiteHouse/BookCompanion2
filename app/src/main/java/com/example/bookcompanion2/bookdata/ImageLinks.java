
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class ImageLinks implements Parcelable
{

    @Json(name = "smallThumbnail")
    private String smallThumbnail;
    @Json(name = "thumbnail")
    private String thumbnail;
    @Json(name = "small")
    private String small;
    @Json(name = "medium")
    private String medium;
    @Json(name = "large")
    private String large;
    @Json(name = "extraLarge")
    private String extraLarge;
    public final static Creator<ImageLinks> CREATOR = new Creator<ImageLinks>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ImageLinks createFromParcel(Parcel in) {
            return new ImageLinks(in);
        }

        public ImageLinks[] newArray(int size) {
            return (new ImageLinks[size]);
        }

    }
    ;

    protected ImageLinks(Parcel in) {
        this.smallThumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.small = ((String) in.readValue((String.class.getClassLoader())));
        this.medium = ((String) in.readValue((String.class.getClassLoader())));
        this.large = ((String) in.readValue((String.class.getClassLoader())));
        this.extraLarge = ((String) in.readValue((String.class.getClassLoader())));
    }

    public ImageLinks() {
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getExtraLarge() {
        return extraLarge;
    }

    public void setExtraLarge(String extraLarge) {
        this.extraLarge = extraLarge;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(smallThumbnail);
        dest.writeValue(thumbnail);
        dest.writeValue(small);
        dest.writeValue(medium);
        dest.writeValue(large);
        dest.writeValue(extraLarge);
    }

    public int describeContents() {
        return  0;
    }

}
