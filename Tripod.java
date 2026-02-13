class Tripod {

    static double getPrice() {
        System.out.println("Retrieving tripod price...");
        return 2500.00;
    }

    static String getBrand() {
        System.out.println("Fetching tripod brand...");
        return "Digitek";
    }

    static double getRating() {
        System.out.println("Checking tripod rating...");
        return 4.3;
    }

    static int getReviews() {
        System.out.println("Counting tripod reviews...");
        return 1800;
    }

    static int getMaxHeight() {
        System.out.println("Checking maximum height...");
        return 165;
    }

    static boolean supportsMobile() {
        System.out.println("Verifying mobile support...");
        return true;
    }

    static boolean supportsCamera() {
        System.out.println("Verifying camera compatibility...");
        return true;
    }

    static int getWarranty() {
        System.out.println("Confirming warranty...");
        return 1;
    }
}
