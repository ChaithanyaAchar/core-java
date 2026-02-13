class SmartLightExecutor{
    public static void main(String[] args){
        boolean ref=Speaker.onOrOff();
        System.out.println("The SmartLight is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The SmartLight is switched:"+ref);
    }
}