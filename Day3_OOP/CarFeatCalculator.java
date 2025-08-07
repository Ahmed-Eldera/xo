import java.util.*;
class CarFeatCalculator implements FeatCalculator{
     public double calcTotal(Map<String , Object> feats,int basePrice){
        if (feats.containsKey("sunroof") && (Boolean) feats.get("sunroof")) {
                    basePrice+=10;
                }
        return basePrice;
    }
}
