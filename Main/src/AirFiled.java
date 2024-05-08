import java.util.ArrayList;

public class AirFiled {
    private final String name;
    private final int capacity;
    private final String address;
    public ArrayList<AerialVehicle> vehicles = new ArrayList<>();

    public AirFiled(String name, int capacity, String address) {
        this.name = name;
        this.capacity = capacity;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getAddress() {
        return this.address;
    }

    public void addAerialVehicle(AerialVehicle aerialVehicle) {
        try {
            if(vehicles.contains(aerialVehicle) || vehicles.size() >= 30) {
                throw new IllegalArgumentException("There's already such vehicle || there are too many vehicles");
            }
            vehicles.add(aerialVehicle);
        } catch(IllegalArgumentException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void removeAerialVehicle(AerialVehicle aerialVehicle) {
        try {
            if(!vehicles.contains(aerialVehicle)) {
                throw new IllegalArgumentException("There's no such vehicle in the list");
            }
        } catch(IllegalArgumentException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }
}