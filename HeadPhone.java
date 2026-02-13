class Headphones {
    static boolean isConnected;
    static int currentVolume;
    static int maxVolume = 10;

    static boolean onOrOff() {
        if (isConnected==false){
            isConnected=true;
            System.out.println("Headphones are ON...");
        }else{
            isConnected=false;
            System.out.println("Headphones are OFF...");
        }
        return isConnected;
    }

    public static void increaseVolume(){
        if(isConnected==true){
            if(currentVolume<maxVolume){
                currentVolume=currentVolume+1;
                System.out.println("Headphones Volume:"+currentVolume);
            }else{
                System.out.println("Max volume reached");
            }
        }else{
            System.out.println("Headphones are OFF. Turn them ON first.");
        }
    }
    public static void decreaseVolume(){
        if(isConnected==true){
            if(currentVolume>0){
                currentVolume=currentVolume-1;
                System.out.println("Headphones Volume:"+currentVolume);
            }else{
                System.out.println("Min volume reached");
            }
        }else{
            System.out.println("Headphones are OFF. Turn them ON first.");
        }
    }
}
