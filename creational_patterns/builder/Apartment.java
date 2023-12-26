package creational_patterns.builder;

public class Apartment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public Apartment(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    public int getSqm() {
        return sqm;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    @Override
    public String toString() {
        return "Apartment [sqm=" + sqm + ", rooms=" + rooms + ", city=" + city + ", area=" + area + ", kitchen="
                + kitchen + "]";
    }

    public void printInfo() {
        System.out.println(this.toString());
    }
}
