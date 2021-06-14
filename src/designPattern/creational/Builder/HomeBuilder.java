package designPattern.creational.Builder;

public class HomeBuilder {
    private Home home;

    public HomeBuilder() {
        home = new Home();
    }


    public HomeBuilder setHouseNumber(int houseNumber) {
        home.setHouseNumber(houseNumber);
        return this;
    }

    public HomeBuilder setStreetName(String streetName) {
        home.setStreetName(streetName);
        return this;
    }


    public HomeBuilder setLocation(String location) {
        home.setLocation(location);
        return this;
    }


    public HomeBuilder setPinCode(int pinCode) {
        home.setPinCode(pinCode);
        return this;
    }

    public Home build(){
        return home;
    }

}
