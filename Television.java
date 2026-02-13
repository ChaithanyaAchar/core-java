class Television{
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume=20;

    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("TV is turned ON...");
        }else{
            isConnected=false;
            System.out.println("TV is turned OFF...");
        }
        return isConnected;
    }

    public static void increaseVolume(){
        if (isConnected=true){
            if (currentVolume < maxVolume){
                currentVolume=currentVolume+1;
                System.out.println("TV Volume:"+currentVolume);
            }else{
                System.out.println("TV Max volume reached");
            }
        }else{
            System.out.println("TV is OFF. Turn it ON first.");
        }
    }
    public static void decreaseVolume(){
        if (isConnected==true){
            if (currentVolume>0){
                currentVolume=currentVolume-1;
                System.out.println("TV Volume:"+currentVolume);
            }else{
                System.out.println("TV Min volume reached");
            }
        }else{
            System.out.println("TV is OFF. Turn it ON first.");
        }
    }
}
