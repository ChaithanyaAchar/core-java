class Television{
    static boolean isConnected;
    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("The Television is turned on...");
        } else if (isConnected==true) {
            isConnected=false;
            System.out.println("The Television is turned off...");
        }
        return isConnected;
    }
}
