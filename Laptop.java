class Laptop{
    static boolean isConnected;
    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("The Laptop is turned on...");
        } else if (isConnected==true) {
            isConnected=false;
            System.out.println("The Laptop is turned off...");
        }
        return isConnected;
    }
}
