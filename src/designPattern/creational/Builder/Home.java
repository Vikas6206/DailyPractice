package designPattern.creational.Builder;

public class Home {
    private int houseNumber;
    private String streetName;
    private String location;
    private long pinCode;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Home{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                ", location='" + location + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
