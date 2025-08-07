import java.util.Map;

public class Truck extends Vehicle{
    Truck(String regNum, String fuel, Map<String, Object> feats) {
        super(regNum, fuel, feats);
            super.setBasePrice(80);
        super.setTotalPrice(calcTotal());
    }
    private double calcTotal(){
        if(getFeatures().containsKey("cargoCapacity"))
        return super.getBasePrice()+ 0.05*((int)getFeatures().get("cargoCapacity"));
        return getBasePrice();
    }
}
