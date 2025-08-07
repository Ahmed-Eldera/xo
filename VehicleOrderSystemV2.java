import java.util.*;

public class VehicleOrderSystemV2 {

    // List to store all vehicles
    private List<Vehicle> inventory;

    public VehicleOrderSystemV2() {
        inventory = new ArrayList<>();
        insertDummies(); // insert dummy data
    }
    public void insertDummies(){
                // Initialize with some vehicles
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new Car("ABC123", "Petrol", carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new Truck("XYZ789",  "Diesel", truckFeatures));
    }
    // Method to check availability
    public boolean checkAvailability(Class<? extends Vehicle> type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if ( v.getAvailable()) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.getFeatures().containsKey(key) || !v.getFeatures().get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to reserve a vehicle
    private Vehicle reserveVehicle(Class<? extends Vehicle>  type, Map<String, Object> desiredFeatures) {
        for (Vehicle v : inventory) {
            if ( v.getAvailable()) {
                boolean matches = true;
                for (String key : desiredFeatures.keySet()) {
                    if (!v.getFeatures().containsKey(key) || !v.getFeatures().get(key).equals(desiredFeatures.get(key))) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    v.setAvailable(false);
                    return v;
                }
            }
        }
        return null; // No matching vehicle available
    }


    public void placeOrder(Class<? extends Vehicle> type, Map<String, Object> desiredFeatures) {
        if (checkAvailability(type, desiredFeatures)) {
            Vehicle v = reserveVehicle(type, desiredFeatures);

            System.out.println("Vehicle reserved: " + v.getRegistrationNumber());
            System.out.println("Total price: $" + v.getTotalPrice());
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }



}
