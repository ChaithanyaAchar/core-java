class DoorBell{
    static boolean isOn;
    static int currentVolume;
    static int maxVolume=8;

    static boolean onOrOff(){
        if (isConnected==false){
            isOn=true;
            System.out.println("Door Bell is ON...");
        }else{
            isOn=false;
            System.out.println("Door Bell is OFF...");
        }
        return isConnected;
    }

    public static void increaseVolume(){
        if (isConnected==true){
            if (cutrrentVolume<maxVolume){
                cutrrentVolume=cutrrentVolume+1;
                System.out.println("Door Bell Volume:"+CurrentVolume);
            }else{
                System.out.println("Max volume reached");
            }
        } else {
            System.out.println("Door Bell is OFF.");
        }
    }
    public static void decreaseVolume(){
        if (isConnected==true){
            if (volume>0){
                currentVolume=currentVolume-1;
                System.out.println("Door Bell Volume:"+currentVolume);
            }else{
                System.out.println("Min volume reached");
            }
        }else{
            System.out.println("Door Bell is OFF.");
        }
    }
}
