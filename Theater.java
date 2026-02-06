class Theater{
    public static void main(String[] args){
        String name="PVR Cinemas";
        String owner="PVR INOX Ltd";
        String address="Orion Mall,Bangalore,Karnataka";
        String services[]={"Movie Screening","Online Booking","Snacks Counter"};
        String screens[]={"Screen 1","Screen 2","Screen 3"};
        System.out.println("The name of the Theater is:"+name);
        System.out.println("The owner of the Theater is:"+owner);
        System.out.println("Address:"+address);
        System.out.println("Services available:");
        for (String service : services){
            System.out.println(service);
        }
        System.out.println("Screens Available:");
		for(String screen:screens){
			System.out.println(screen);
        }
    }
}
