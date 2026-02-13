class ElectricKettleExecutor {
    public static void main(String[] args) {

        double price = ElectricKettle.getPrice();
        String brand = ElectricKettle.getBrand();
        double rating = ElectricKettle.getRating();
        int reviews = ElectricKettle.getReviews();
        int capacity = ElectricKettle.getCapacity();
        boolean auto = ElectricKettle.hasAutoCutOff();
        int warranty = ElectricKettle.getWarranty();
        String material = ElectricKettle.getMaterial();
        int stock = ElectricKettle.getStock();
        boolean prime = ElectricKettle.isPrimeAvailable();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Auto Cut Off: " + auto);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Material: " + material);
        System.out.println("Stock: " + stock);
        System.out.println("Prime Available: " + prime);
    }
}
