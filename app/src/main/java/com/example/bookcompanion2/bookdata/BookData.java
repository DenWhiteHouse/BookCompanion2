
package com.example.bookcompanion2.bookdata;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookData implements Parcelable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("totalItems")
    @Expose
    private Long totalItems;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    public final static Creator<BookData> CREATOR = new Creator<BookData>() {


        @SuppressWarnings({
            "unchecked"
        })
        public BookData createFromParcel(Parcel in) {
            return new BookData(in);
        }

        public BookData[] newArray(int size) {
            return (new BookData[size]);
        }

    }
    ;

    protected BookData(Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.totalItems = ((Long) in.readValue((Long.class.getClassLoader())));
        in.readList(this.items, (Item.class.getClassLoader()));
    }

    public BookData() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(totalItems);
        dest.writeList(items);
    }

    public int describeContents() {
        return  0;
    }

}
