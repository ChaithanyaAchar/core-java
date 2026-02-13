class ElectricHeaterExecutor {
    public static void main(String[] args) {

        double price = ElectricHeater.getPrice();
        String brand = ElectricHeater.getBrand();
        double rating = ElectricHeater.getRating();
        int reviews = ElectricHeater.getReviews();
        int power = ElectricHeater.getPower();
        boolean thermostat = ElectricHeater.hasThermostat();
        boolean protection = ElectricHeater.hasOverheatProtection();
        int warranty = ElectricHeater.getWarranty();
        String color = ElectricHeater.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Power: " + power + " Watts");
        System.out.println("Thermostat: " + thermostat);
        System.out.println("Overheat Protection: " + protection);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
