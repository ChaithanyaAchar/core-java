class WebcamExecutor {
    public static void main(String[] args) {

        double price = Webcam.getPrice();
        String brand = Webcam.getBrand();
        double rating = Webcam.getRating();
        int reviews = Webcam.getReviews();
        String resolution = Webcam.getResolution();
        boolean mic = Webcam.hasBuiltInMic();
        int warranty = Webcam.getWarranty();
        String color = Webcam.getColor();

        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Resolution: " + resolution);
        System.out.println("Built-in Mic: " + mic);
        System.out.println("Warranty: " + warranty + " Years");
        System.out.println("Color: " + color);
    }
}
