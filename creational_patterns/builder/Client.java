package creational_patterns.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();

        Apartment a1 = apartmentBuilder.setSqm(25).setRooms(2).setCity("Can Tho").setArea("Viet Name").setKitchen(true)
                .build();

        a1.printInfo();

        Apartment a2 = apartmentBuilder.setCity("Can Tho").setArea("Viet Name").build();

        a2.printInfo();
    }
}
