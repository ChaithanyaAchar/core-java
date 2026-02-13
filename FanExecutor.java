class FanExecutor{
    public static void main(String[] args){
        boolean ref=Fan.onOrOff();
        System.out.println("The Fan is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The Fan is switched:"+ref);
    }
}