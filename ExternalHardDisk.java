class ExternalHardDisk {

    static double getPrice() {
        System.out.println("Retrieving external hard disk price...");
        return 6500.00;
    }

    static String getBrand() {
        System.out.println("Fetching external hard disk brand...");
        return "Seagate";
    }

    static double getRating() {
        System.out.println("Checking hard disk rating...");
        return 4.6;
    }

    static int getReviews() {
        System.out.println("Counting hard disk reviews...");
        return 9000;
    }

    static int getStorage() {
        System.out.println("Checking storage capacity...");
        return 1024;
    }

    static boolean supportsUSB3() {
        System.out.println("Verifying USB 3.0 support...");
        return true;
    }

    static int getWarranty() {
        System.out.println("Confirming warranty...");
        return 3;
    }

    static String getColor() {
        System.out.println("Fetching color...");
        return "Black";
    }
}
