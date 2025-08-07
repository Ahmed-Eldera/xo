import java.util.Map;

public class Motorcycle extends Vehicle{
    Motorcycle(String regNum, String fuel, Map<String, Object> feats) {
        super(regNum, fuel, feats);
        super.setBasePrice(30);
        super.setTotalPrice(calcTotal());
    }
    private double calcTotal(){
        return super.getBasePrice();
    }
}
