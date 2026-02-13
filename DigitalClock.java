class DigitalClock {
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume=5;

    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("Digital Clock is turned ON...");
        } else {
            isConnected=false;
            System.out.println("Digital Clock is turned OFF...");
        }
        return isConnected;
    }

    public static void increaseVolume() {
        System.out.println("Increase Alarm Volume is invoked...");
        if (isConnected=true) {
            if (currentVolume < maxVolume) {
                currentVolume=currentVolume+1;
                System.out.println("Current Volume:"+currentVolume);
            }else{
                System.out.println("Max alarm volume reached...");
            }
        } else {
            System.out.println("Clock is OFF. Turn it ON first.");
        }
    }

    public static void decreaseVolume() {
        System.out.println("Decrease Alarm Volume is invoked...");
        if (isOn) {
            if (alarmVolume > 0) {
                alarmVolume--;
                System.out.println("Alarm Volume: " + alarmVolume);
            } else {
                System.out.println("Min alarm volume reached...");
            }
        } else {
            System.out.println("Clock is OFF. Turn it ON first.");
        }
    }
}
