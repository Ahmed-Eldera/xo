import java.util.Map;

public class MotoFeatCalculator implements FeatCalculator{
    @Override
    public double calcTotal(Map<String, Object> feats, int basePrice) {

        return basePrice;
    }
}
