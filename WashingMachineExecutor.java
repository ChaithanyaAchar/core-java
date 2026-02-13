class WashingMachineExecutor {
    public static void main(String[] args) {

        double price = WashingMachine.getPrice();
        String brand = WashingMachine.getBrand();
        double rating = WashingMachine.getRating();
        int reviews = WashingMachine.getReviews();
        int capacity = WashingMachine.getCapacity();
        String type = WashingMachine.getType();
        boolean inverter = WashingMachine.hasInverterMotor();
        int warranty = WashingMachine.getWarranty();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " KG");
        System.out.println("Type: " + type);
        System.out.println("Inverter Motor: " + inverter);
        System.out.println("Warranty: " + warranty + " Years");
    }
}