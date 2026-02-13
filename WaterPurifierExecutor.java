class WaterPurifierExecutor {
    public static void main(String[] args) {

        double price = WaterPurifier.getPrice();
        String brand = WaterPurifier.getBrand();
        double rating = WaterPurifier.getRating();
        int reviews = WaterPurifier.getReviews();
        String purificationType = WaterPurifier.getPurificationType();
        int capacity = WaterPurifier.getCapacity();
        boolean mineralFilter = WaterPurifier.hasMineralFilter();
        int warranty = WaterPurifier.getWarranty();
        String color = WaterPurifier.getColor();
        int stock = WaterPurifier.getStock();
        double discount = WaterPurifier.getDiscount();
        String category = WaterPurifier.getCategory();
        boolean prime = WaterPurifier.isPrimeAvailable();
        int deliveryDays = WaterPurifier.getDeliveryDays();
        String model = WaterPurifier.getModel();

        System.out.println("Water Purifier Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Purification Type: " + purificationType);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Mineral Filter: " + mineralFilter);
        System.out.println("Warranty: " + warranty + " Year");
        System.out.println("Color: " + color);
        System.out.println("Stock: " + stock);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Category: " + category);
        System.out.println("Prime Available: " + prime);
        System.out.println("Delivery Days: " + deliveryDays);
        System.out.println("Model: " + model);
    }
}
