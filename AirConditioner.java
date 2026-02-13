class AirConditioner {
    static boolean isConnected;
    static int currentTemp=24;
    static int maxTemp = 30;

    static boolean onOrOff() {
        if (isConnected==false) {
            isConnected = true;
            System.out.println("Air Conditioner is turned ON...");
        } else {
            isConnected = false;
            System.out.println("Air Conditioner is turned OFF...");
        }
        return isConnected;
    }

    public static void increaseTemp() {
        System.out.println("Increase Temperature is invoked...");
        if (isConnected) {
            if (currentTemp < maxTemp) {
                currentTemp=currentTemp+1;
                System.out.println("Current Temperature: " + currentTemp);
            } else {
                System.out.println("Max temperature reached...");
            }
        } else {
            System.out.println("AC is OFF. Turn it ON first.");
        }
    }

    public static void decreaseTemp() {
        System.out.println("Decrease Temperature is invoked...");
        if (isConnected) {
            if (currentTemp > minTemp) {
                currentTemp=currentTemp-1;
                System.out.println("Current Temperature: " + currentTemp);
            } else {
                System.out.println("Min temperature reached...");
            }
        } else {
            System.out.println("AC is OFF. Turn it ON first.");
        }
    }
}
