import java.util.Map;

abstract class Vehicle {
        private String registrationNumber;
        private String fuelType; // Petrol, Diesel, Electric, Hybrid
        private boolean isAvailable;
        private Map<String, Object> features; // e.g., sunroof, cargo capacity, etc.
        private double BasePrice;
        private double TotalPrice;
        Vehicle(String regNum, String fuel, Map<String, Object> feats) {
            this.registrationNumber = regNum;
            this.fuelType = fuel;
            this.isAvailable = true;
            this.features = feats;
        }
        public  double getBasePrice() {
            return BasePrice;
        }
        public  double getTotalPrice(){
            return TotalPrice;
        }
        public String getRegistrationNumber(){
            return registrationNumber;
        }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setBasePrice(double basePrice) {
        BasePrice = basePrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public Map<String, Object> getFeatures() {
        return features;
    }
}
