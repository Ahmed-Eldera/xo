import java.util.Map;

public class TruckFeatCalculator implements FeatCalculator{

    @Override
    public double calcTotal(Map<String, Object> feats, int basePrice) {
        double x = basePrice;
        if (feats.containsKey("cargoCapacity")) {
                    x += ((double) feats.get("cargoCapacity")) * 0.05;
        }
        return x;
    }
}
