
package com.example.bookcompanion2.bookdata;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;

public class VolumeInfo implements Parcelable
{

    @Json(name = "title")
    private String title;
    @Json(name = "authors")
    private List<String> authors = null;
    @Json(name = "publisher")
    private String publisher;
    @Json(name = "publishedDate")
    private String publishedDate;
    @Json(name = "description")
    private String description;
    @Json(name = "readingModes")
    private ReadingModes readingModes;
    @Json(name = "pageCount")
    private Integer pageCount;
    @Json(name = "printedPageCount")
    private Integer printedPageCount;
    @Json(name = "dimensions")
    private Dimensions dimensions;
    @Json(name = "printType")
    private String printType;
    @Json(name = "averageRating")
    private Double averageRating;
    @Json(name = "ratingsCount")
    private Integer ratingsCount;
    @Json(name = "maturityRating")
    private String maturityRating;
    @Json(name = "allowAnonLogging")
    private Boolean allowAnonLogging;
    @Json(name = "contentVersion")
    private String contentVersion;
    @Json(name = "panelizationSummary")
    private PanelizationSummary panelizationSummary;
    @Json(name = "imageLinks")
    private ImageLinks imageLinks;
    @Json(name = "language")
    private String language;
    @Json(name = "previewLink")
    private String previewLink;
    @Json(name = "infoLink")
    private String infoLink;
    @Json(name = "canonicalVolumeLink")
    private String canonicalVolumeLink;
    public final static Creator<VolumeInfo> CREATOR = new Creator<VolumeInfo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public VolumeInfo createFromParcel(Parcel in) {
            return new VolumeInfo(in);
        }

        public VolumeInfo[] newArray(int size) {
            return (new VolumeInfo[size]);
        }

    }
    ;

    protected VolumeInfo(Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.authors, (String.class.getClassLoader()));
        this.publisher = ((String) in.readValue((String.class.getClassLoader())));
        this.publishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.readingModes = ((ReadingModes) in.readValue((ReadingModes.class.getClassLoader())));
        this.pageCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.printedPageCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dimensions = ((Dimensions) in.readValue((Dimensions.class.getClassLoader())));
        this.printType = ((String) in.readValue((String.class.getClassLoader())));
        this.averageRating = ((Double) in.readValue((Double.class.getClassLoader())));
        this.ratingsCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.maturityRating = ((String) in.readValue((String.class.getClassLoader())));
        this.allowAnonLogging = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.contentVersion = ((String) in.readValue((String.class.getClassLoader())));
        this.panelizationSummary = ((PanelizationSummary) in.readValue((PanelizationSummary.class.getClassLoader())));
        this.imageLinks = ((ImageLinks) in.readValue((ImageLinks.class.getClassLoader())));
        this.language = ((String) in.readValue((String.class.getClassLoader())));
        this.previewLink = ((String) in.readValue((String.class.getClassLoader())));
        this.infoLink = ((String) in.readValue((String.class.getClassLoader())));
        this.canonicalVolumeLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public VolumeInfo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReadingModes getReadingModes() {
        return readingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPrintedPageCount() {
        return printedPageCount;
    }

    public void setPrintedPageCount(Integer printedPageCount) {
        this.printedPageCount = printedPageCount;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    public String getContentVersion() {
        return contentVersion;
    }

    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    public PanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getInfoLink() {
        return infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeList(authors);
        dest.writeValue(publisher);
        dest.writeValue(publishedDate);
        dest.writeValue(description);
        dest.writeValue(readingModes);
        dest.writeValue(pageCount);
        dest.writeValue(printedPageCount);
        dest.writeValue(dimensions);
        dest.writeValue(printType);
        dest.writeValue(averageRating);
        dest.writeValue(ratingsCount);
        dest.writeValue(maturityRating);
        dest.writeValue(allowAnonLogging);
        dest.writeValue(contentVersion);
        dest.writeValue(panelizationSummary);
        dest.writeValue(imageLinks);
        dest.writeValue(language);
        dest.writeValue(previewLink);
        dest.writeValue(infoLink);
        dest.writeValue(canonicalVolumeLink);
    }

    public int describeContents() {
        return  0;
    }

}
