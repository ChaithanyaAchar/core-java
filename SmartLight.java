class SmartLight{
    static boolean isConnected;
    static int currentBrightness;
    static int maxBrightness=10;

    static boolean onOrOff(){
        if(isConnected==false){
            isConnected=true;
            System.out.println("Light is ON...");
        }else{
            isConnected=false;
            System.out.println("Light is OFF...");
        }
        return isConnected;
    }

    public static void increaseBrightness(){
        if (isConnected==true) {
            if (cutrrentVolume<maxBrightness){
                cutrrentVolume=cutrrentVolume+1;
                System.out.println("Current Brightness:"+currentBrightness);
            }else{
                System.out.println("Max brightness reached");
            }
        }else{
            System.out.println("Light is OFF. Turn it ON first.");
        }
    }
    public static void decreaseBrightness() {
        if (isConnected==true) {
            if (currentBrightness>0) {
                currentBrightness=currentBrightness-1;
                System.out.println("Brightness:"+currentBrightness);
            }else{
                System.out.println("Min brightness reached");
            }
        }else{
            System.out.println("Light is OFF. Turn it ON first.");
        }
    }
}
