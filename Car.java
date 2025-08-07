import java.util.HashMap;
import java.util.Map;

public class Car extends Vehicle {
    CarFeatCalculator calculator;
    Car(String regNum, String fuel, Map<String, Object> feats) {
        super(regNum, fuel, feats);
        calculator = new CarFeatCalculator();
        super.setBasePrice(50);
    super.setTotalPrice(calculator.calcTotal(getFeatures(),50));
    }



}
