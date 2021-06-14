package designPattern.creational.Builder;

public class MainClass {
    public static void main(String args[]){
        Home home = new HomeBuilder()
                .setStreetName("Bakers")
                .setHouseNumber(23)
                .setLocation("Yelehanka")
                .setPinCode(562149)
                .build();

        System.out.println("Home address is :"+ home);
    }
}
