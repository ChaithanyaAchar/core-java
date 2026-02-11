class AirConditioner{
    static boolean isConnected;
    static boolean onOrOff(){
        if (isConnected==true){
            isConnected=false;
            System.out.println("The AirConditioner is turned on...");
        } else if (isConnected==false) {
            isConnected=true;
            System.out.println("The AirConditioner is turned off...");
        }
        return isConnected;
    }
}
