class ElectricKettle {
    static boolean isConnected;

    static boolean onOrOff() {
        if (isConnected == true) {
            isConnected = false;
            System.out.println("The Electric Kettle is turned OFF...");
        } else if (isConnected == false) {
            isConnected = true;
            System.out.println("The Electric Kettle is turned ON...");
        }
        return isConnected;
    }
}
