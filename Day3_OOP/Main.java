import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehicleOrderSystemV2 system = new VehicleOrderSystemV2();
        // Example order for a Car with sunroof and automatic transmission
        Map<String, Object> features = new HashMap<>();
        Vehicle inp = new Car("123","petrol",features);
        features.put("sunroof", true);
        features.put("transmission", "Automatic");
        system.placeOrder(inp.getClass(), features);

        // Example order for a Truck with cargo capacity 1500
        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        system.placeOrder(inp.getClass(), truckFeatures);
    }
}