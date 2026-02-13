class Microphone{
    static boolean isConnected;
    static int currentVolume
    static int maxVolume=10;

    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("Microphone is ON...");
        }else{
            isConnected=false;
            System.out.println("Microphone is OFF...");
        }
        return isConnected;
    }
    public static void increaseVolume(){
        if (isConnected==true){
            if (currentVolume<maxVolume){
                currentVolume=currentVolume+1;
                System.out.println("Current Volume:"+currentVolume);
            }else{
                System.out.println("Max Volume reached");
            }
        }else{
            System.out.println("Microphone is OFF.");
        }
    }
    public static void decreaseVolume() {
        if (isConnected==true){
            if (currentVolume>0){
                currentVolume=currentVolume-1;
                System.out.println("Current Volume:"+currentVolume);
            } else {
                System.out.println("Min volume reached");
            }
        } else {
            System.out.println("Microphone is OFF.");
        }
    }
}
