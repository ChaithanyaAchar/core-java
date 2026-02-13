class DigitalClockExecutor{
    public static void main(String[] args){
        boolean ref=DigitalClock.onOrOff();
        System.out.println("The DigitalClock is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The DigitalClockn is switched:"+ref);
    }
}