package com.freshcells.xmljsonconverter.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;

import java.util.List;

@lombok.Data
@AllArgsConstructor
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Data {

    public Data() {
        this.attributes = new Attributes8();
    }

    @JsonProperty("@attributes")
    private Attributes8 attributes;

    @JsonIgnore
    private String id;

    private String pdfFile;

    private String hotelName;

    private String hotelKategorie;

    private String stadtName;

    private String zielgebietsName;

    private Integer stadtNummer;

    private Integer zielgebietsNummer;

    private String landName;

    private String landCode;

    private String ceranstalterCode;

    private String dateStart;

    private String dateEnd;

    private GeoData geoData;

    private String objectCode;

    private ObjectCodes objectCodes;

    private Text2 text;

    private String landKarte;

    private Climate climate;

    private String katalogId;

    private String katalogSeiete;

    private Integer preisseite;

    private String katalogName;

    private String veranstalterName;

    private Integer veranstalterId;

    private Integer katalogHotelId;

    private String katalogSaisonType;

    private List<BildFile> bildFiles;

    private String textFile;

    private String klimagrafik;

    private String agb;

    private String tds;

    @XmlAttribute(name = "id")
    public String getId() {
        return this.attributes.getId();
    }

    public void setId(String id) {
        attributes.setId(id);
    }

    @XmlElement(name = "PDFfile")
    public String getPdfFile() {
        return pdfFile;
    }

    @XmlElement(name = "Hotelname")
    public String getHotelName() {
        return hotelName;
    }

    @XmlElement(name = "Hotelkategorie")
    public String getHotelKategorie() {
        return hotelKategorie;
    }

    @XmlElement(name = "Stadtname")
    public String getStadtName() {
        return stadtName;
    }

    @XmlElement(name = "Zielgebietsname")
    public String getZielgebietsName() {
        return zielgebietsName;
    }

    @XmlElement(name = "Stadtnummer")
    public Integer getStadtNummer() {
        return stadtNummer;
    }

    @XmlElement(name = "Zielgebietsnummer")
    public Integer getZielgebietsNummer() {
        return zielgebietsNummer;
    }

    @XmlElement(name = "Landname")
    public String getLandName() {
        return landName;
    }

    @XmlElement(name = "Landcode")
    public String getLandCode() {
        return landCode;
    }

    @XmlElement(name = "Veranstaltercode")
    public String getCeranstalterCode() {
        return ceranstalterCode;
    }

    @XmlElement(name = "datestart")
    public String getDateStart() {
        return dateStart;
    }

    @XmlElement(name = "dateend")
    public String getDateEnd() {
        return dateEnd;
    }

    @XmlElement(name = "GeoData")
    public GeoData getGeoData() {
        return geoData;
    }

    @XmlElement(name = "Objectcode")
    public String getObjectCode() {
        return objectCode;
    }

    @XmlElement(name = "Objectcodes")
    public ObjectCodes getObjectCodes() {
        return objectCodes;
    }

    @XmlElement(name = "Text")
    public Text2 getText() {
        return text;
    }

    @XmlElement(name = "Landkarte")
    public String getLandKarte() {
        return landKarte;
    }

    @XmlElement(name = "KatalogID")
    public String getKatalogId() {
        return katalogId;
    }

    @XmlElement(name = "Katalogseite")
    public String getKatalogSeiete() {
        return katalogSeiete;
    }

    @XmlElement(name = "Preisseite")
    public Integer getPreisseite() {
        return preisseite;
    }

    @XmlElement(name = "Katalogname")
    public String getKatalogName() {
        return katalogName;
    }

    @XmlElement(name = "Veranstaltername")
    public String getVeranstalterName() {
        return veranstalterName;
    }

    @XmlElement(name = "VeranstalterID")
    public Integer getVeranstalterId() {
        return veranstalterId;
    }

    @XmlElement(name = "KataloghotelID")
    public Integer getKatalogHotelId() {
        return katalogHotelId;
    }

    @XmlElement(name = "KatalogSaisonTyp")
    public String getKatalogSaisonType() {
        return katalogSaisonType;
    }

    @XmlElement(name = "Bildfile")
    public List<BildFile> getBildFiles() {
        return bildFiles;
    }

    @XmlElement(name = "Textfile")
    public String getTextFile() {
        return textFile;
    }

    @XmlElement(name = "Klimagrafik")
    public String getKlimagrafik() {
        return klimagrafik;
    }

    @XmlElement(name = "AGB")
    public String getAgb() {
        return agb;
    }

    @XmlElement(name = "TDS")
    public String getTds() {
        return tds;
    }
}
