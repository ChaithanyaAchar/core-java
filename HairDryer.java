class HairDryer{
    static boolean isConnected;
    static boolean onOrOff(){
        if (isConnected==true){
            isConnected=false;
            System.out.println("The HairDryer is turned on...");
        } else if (isConnected==false) {
            isConnected=true;
            System.out.println("The HairDryer is turned off...");
        }
        return isConnected;
    }
}
