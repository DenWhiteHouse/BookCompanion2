
package com.example.bookcompanion2.bookdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class ReadingModes implements Parcelable
{

    @Json(name = "text")
    private Boolean text;
    @Json(name = "image")
    private Boolean image;
    public final static Creator<ReadingModes> CREATOR = new Creator<ReadingModes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ReadingModes createFromParcel(Parcel in) {
            return new ReadingModes(in);
        }

        public ReadingModes[] newArray(int size) {
            return (new ReadingModes[size]);
        }

    }
    ;

    protected ReadingModes(Parcel in) {
        this.text = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.image = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public ReadingModes() {
    }

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(text);
        dest.writeValue(image);
    }

    public int describeContents() {
        return  0;
    }

}
