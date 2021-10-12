package Exercise_1;

public class Address {

    private String streetName;
    private int houseNumber;
    private float floorNumberAndSide;
    private int zipCode;
    private String country;

    public Address(String streetName, int houseNumber, float floorNumberAndSide, int zipCode, String country) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.floorNumberAndSide = floorNumberAndSide;
        this.zipCode = zipCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", floorNumberAndSide=" + floorNumberAndSide +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreetName() {

        return streetName;
    }

    public void setStreetName(String streetName) {

        this.streetName = streetName;
    }

    public int getHouseNumber() {

        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {

        this.houseNumber = houseNumber;
    }

    public float getFloorNumberAndSide() {

        return floorNumberAndSide;
    }

    public void setFloorNumberAndSide(float floorNumberAndSide) {

        this.floorNumberAndSide = floorNumberAndSide;
    }

    public int getZipCode() {

        return zipCode;
    }

    public void setZipCode(int zipCode) {

        this.zipCode = zipCode;
    }

    public String getCountry() {

        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }
}
