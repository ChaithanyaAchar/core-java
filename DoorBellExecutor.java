class DoorBellExecutor{
    public static void main(String[] args){
        boolean ref=DoorBell.onOrOff();
        System.out.println("The DoorBell is switched:"+ref);
	    ref=Speaker.onOrOff();
		System.out.println("The DoorBell is switched:"+ref);
    }
}