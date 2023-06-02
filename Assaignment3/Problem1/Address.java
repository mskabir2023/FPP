package Assignment3.Problem1;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(String streetName, String cityName, String state, String zip) {
        this.street = streetName;
        this.city = cityName;
        this.state = state;
        this.zipcode = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String streetName) {
        this.street = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String cityName) {
        this.city = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zipcode;
    }

    public void setZip(String zip) {
        this.zipcode = zip;
    }
}
