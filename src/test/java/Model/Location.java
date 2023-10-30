package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Location {
    private String postcode;
    private String country;
    private String countryyabbreviation;
    ArrayList<Place> places;

    @JsonProperty("post code")

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryyabbreviation() {
        return countryyabbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryyabbreviation(String countryyabbreviation) {
        this.countryyabbreviation = countryyabbreviation;
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return "Model.Location{" +
                "postcode='" + postcode + '\'' +
                ", country='" + country + '\'' +
                ", countryyabbreviation='" + countryyabbreviation + '\'' +
                ", places=" + places +
                '}';
    }
}


