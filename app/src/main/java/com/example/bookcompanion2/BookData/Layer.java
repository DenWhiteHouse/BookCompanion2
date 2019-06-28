
package com.example.bookcompanion2.BookData;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.squareup.moshi.Json;

public class Layer implements Parcelable
{

    @Json(name = "layerId")
    private String layerId;
    @Json(name = "volumeAnnotationsVersion")
    private String volumeAnnotationsVersion;
    public final static Creator<Layer> CREATOR = new Creator<Layer>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Layer createFromParcel(Parcel in) {
            return new Layer(in);
        }

        public Layer[] newArray(int size) {
            return (new Layer[size]);
        }

    }
    ;

    protected Layer(Parcel in) {
        this.layerId = ((String) in.readValue((String.class.getClassLoader())));
        this.volumeAnnotationsVersion = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Layer() {
    }

    public String getLayerId() {
        return layerId;
    }

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    public String getVolumeAnnotationsVersion() {
        return volumeAnnotationsVersion;
    }

    public void setVolumeAnnotationsVersion(String volumeAnnotationsVersion) {
        this.volumeAnnotationsVersion = volumeAnnotationsVersion;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(layerId);
        dest.writeValue(volumeAnnotationsVersion);
    }

    public int describeContents() {
        return  0;
    }

}
