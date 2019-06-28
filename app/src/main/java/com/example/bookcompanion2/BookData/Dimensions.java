
package com.example.bookcompanion2.BookData;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.squareup.moshi.Json;

public class Dimensions implements Parcelable
{

    @Json(name = "height")
    private String height;
    public final static Creator<Dimensions> CREATOR = new Creator<Dimensions>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Dimensions createFromParcel(Parcel in) {
            return new Dimensions(in);
        }

        public Dimensions[] newArray(int size) {
            return (new Dimensions[size]);
        }

    }
    ;

    protected Dimensions(Parcel in) {
        this.height = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Dimensions() {
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(height);
    }

    public int describeContents() {
        return  0;
    }

}
