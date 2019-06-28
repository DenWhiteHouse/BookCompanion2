
package com.example.bookcompanion2.BookData;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.squareup.moshi.Json;

public class Book implements Parcelable
{

    @Json(name = "kind")
    private String kind;
    @Json(name = "id")
    private String id;
    @Json(name = "etag")
    private String etag;
    @Json(name = "selfLink")
    private String selfLink;
    @Json(name = "volumeInfo")
    private VolumeInfo volumeInfo;
    @Json(name = "layerInfo")
    private LayerInfo layerInfo;
    @Json(name = "saleInfo")
    private SaleInfo saleInfo;
    @Json(name = "accessInfo")
    private AccessInfo accessInfo;
    public final static Creator<Book> CREATOR = new Creator<Book>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        public Book[] newArray(int size) {
            return (new Book[size]);
        }

    }
    ;

    protected Book(Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.etag = ((String) in.readValue((String.class.getClassLoader())));
        this.selfLink = ((String) in.readValue((String.class.getClassLoader())));
        this.volumeInfo = ((VolumeInfo) in.readValue((VolumeInfo.class.getClassLoader())));
        this.layerInfo = ((LayerInfo) in.readValue((LayerInfo.class.getClassLoader())));
        this.saleInfo = ((SaleInfo) in.readValue((SaleInfo.class.getClassLoader())));
        this.accessInfo = ((AccessInfo) in.readValue((AccessInfo.class.getClassLoader())));
    }

    public Book() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public LayerInfo getLayerInfo() {
        return layerInfo;
    }

    public void setLayerInfo(LayerInfo layerInfo) {
        this.layerInfo = layerInfo;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public AccessInfo getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(id);
        dest.writeValue(etag);
        dest.writeValue(selfLink);
        dest.writeValue(volumeInfo);
        dest.writeValue(layerInfo);
        dest.writeValue(saleInfo);
        dest.writeValue(accessInfo);
    }

    public int describeContents() {
        return  0;
    }

}
