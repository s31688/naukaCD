public class AerialVehicle {
    private final int registrationNumber;
    private final String color;
    private final String model;
    private final int yearOfProduction;

    public AerialVehicle(int registrationNumber, String color, String model, int yearOfProduction) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public int getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void displayInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getRegistrationNumber() + " " + this.getColor() + " "
        + this.getModel() + " " + this.getYearOfProduction() + ")");
    }
}

class Helicopter extends AerialVehicle {
    private final int rotorCount;
    private final int maxAltitude;

    public Helicopter(int registrationNumber, String color, String model, int yearOfProduction, int rotorCount,
                      int maxAltitude) {
        super(registrationNumber, color, model, yearOfProduction);
        this.rotorCount = rotorCount;
        this.maxAltitude = maxAltitude;
    }

    public int getRotorCount() {
        return this.rotorCount;
    }

    public int getMaxAltitude() {
        return this.maxAltitude;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getRegistrationNumber() + " " + this.getColor() + " "
                + this.getModel() + " " + this.getYearOfProduction() + " " + this.getRotorCount() + " "
                + this.getMaxAltitude() + ")");
    }
}

class Drone extends AerialVehicle {
    private final int batteryLife;
    private final boolean cameraEquipped;

    public Drone(int registrationNumber, String color, String model, int yearOfProduction, int batteryLife,
                 boolean cameraEquipped) {
        super(registrationNumber, color, model, yearOfProduction);
        this.batteryLife = batteryLife;
        this.cameraEquipped = cameraEquipped;
    }

    public int getBatteryLife() {
        return this.batteryLife;
    }

    public boolean getCameraEquipped() {
        return this.cameraEquipped;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getRegistrationNumber() + " " + this.getColor() + " "
                + this.getModel() + " " + this.getYearOfProduction() + " " + this.getBatteryLife() + " "
                + this.getCameraEquipped() + ")");
    }
}

class Glider extends AerialVehicle {
    private final int wingLength;

    public Glider(int registrationNumber, String color, String model, int yearOfProduction, int wingLength) {
        super(registrationNumber, color, model, yearOfProduction);
        this.wingLength = wingLength;
    }

    public int getWingLength() {
        return wingLength;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getName() + " (" + this.getRegistrationNumber() + " " + this.getColor() + " "
                + this.getModel() + " " + this.getYearOfProduction() + " " + this.getWingLength() + " " + ")");
    }
}