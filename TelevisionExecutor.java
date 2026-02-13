class TelevisionExecutor{
    public static void main(String[] args){
        boolean ref=Speaker.onOrOff();
        System.out.println("The Television is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The Television is switched:"+ref);
    }
}