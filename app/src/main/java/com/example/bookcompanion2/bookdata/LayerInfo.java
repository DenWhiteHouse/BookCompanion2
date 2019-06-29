
package com.example.bookcompanion2.bookdata;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class LayerInfo implements Parcelable
{

    @Json(name = "layers")
    private List<Layer> layers = null;
    public final static Creator<LayerInfo> CREATOR = new Creator<LayerInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public LayerInfo createFromParcel(Parcel in) {
            return new LayerInfo(in);
        }

        public LayerInfo[] newArray(int size) {
            return (new LayerInfo[size]);
        }

    }
    ;

    protected LayerInfo(Parcel in) {
        in.readList(this.layers, (Layer.class.getClassLoader()));
    }

    public LayerInfo() {
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(layers);
    }

    public int describeContents() {
        return  0;
    }

}
