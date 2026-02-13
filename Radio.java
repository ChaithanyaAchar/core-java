class Radio{
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume=8;
    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("Radio is turned ON...");
        }else{
            isConnected=false;
            System.out.println("Radio is turned OFF...");
        }
        return isConnected;
    }
    public static void increaseVolume(){
        if(isConnected==true){
            if (currentVolume<maxVolume){
                currentVolume=currentVolume+1;
                System.out.println("Radio Volume:"+currentVolume);
            }else{
                System.out.println("Radio max volume reached");
            }
        }else{
            System.out.println("Radio is OFF. Turn it ON first.");
        }
    }

    public static void decreaseVolume(){
        if (isConnected==true){
            if (currentVolume > 0) {
                currentVolume=currentVolume-1;
                System.out.println("Radio Volume:"+currentVolume);
            }else{
                System.out.println("Radio min volume reached");
            }
        }else{
            System.out.println("Radio is OFF. Turn it ON first.");
        }
    }
}
