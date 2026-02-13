class RadioExecutor{
    public static void main(String[] args){
        boolean ref=Radio.onOrOff();
        System.out.println("The Radio is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The Radio is switched:"+ref);
    }
}