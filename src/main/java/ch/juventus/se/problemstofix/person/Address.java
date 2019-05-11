package ch.juventus.se.problemstofix.person;

/**
 * @author: Linda Krüger
 * @since: 12.09.17
 */
public class Address {

    private String street;
    private int houseNr;
    private int plz;
    private String city;
    private String country;

    public Address(String street, int houseNr, int plz, String city, String country) {
        this.street = street;
        this.houseNr = houseNr;
        this.plz = plz;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
