public class Main {
    public static void main(String[] args) {
        AirFiled airFiled = new AirFiled("Chopin", 123, "Warsaw city");
        Helicopter helicopter = new Helicopter(1234, "red", "abc", 2012,
                21, 200);
        helicopter.displayInfo();
        Drone drone = new Drone(345, "black", "qwerty", 2001, 12,
                true);
        drone.displayInfo();
        Glider glider = new Glider(456, "yellow", "x", 1994, 45);
        glider.displayInfo();
        airFiled.addAerialVehicle(helicopter);
        airFiled.addAerialVehicle(drone);
        airFiled.removeAerialVehicle(glider);
        System.out.println(airFiled.vehicles);
        airFiled.removeAerialVehicle(helicopter);
        airFiled.addAerialVehicle(drone);
        airFiled.addAerialVehicle(glider);
        System.out.println(airFiled.vehicles);
    }
}