class Fan{
    static boolean isConnected;
    static int currentSpeed;
    static int maxSpeed=5;

    static boolean onOrOff(){
        if (isConnected==false){
            isConnected=true;
            System.out.println("Fan is turned ON...");
        }else{
            isConnected=false;
            System.out.println("Fan is turned OFF...");
        }
        return isConnected;
    }

    public static void increaseSpeed(){
        if (isConnected==true){
            if (currentSpeed<maxSpeed){
                currentSpeed=currentSpeed+1;
                System.out.println("Fan Speed: "+currentSpeed);
            }else{
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Fan is OFF. Turn it ON first.");
        }
    }

    public static void decreaseSpeed() {
        if (isConnected) {
            if (currentSpeed > 0) {
                currentSpeed--;
                System.out.println("Fan Speed: " + currentSpeed);
            } else {
                System.out.println("Min speed reached");
            }
        } else {
            System.out.println("Fan is OFF. Turn it ON first.");
        }
    }
}
