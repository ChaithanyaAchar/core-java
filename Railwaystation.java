class RailwayStation{
    public static void main(String[] args){
        String name="Bangalore City Railway Station";
        String owner="Indian Railways";
        String address="Krantivira Sangolli Rayanna Rd, Bangalore, Karnataka - 560023";
        String services[]={"Ticket Booking","Waiting Room","Catering"};
        String platforms[]={"Platform 1","Platform 2","Platform 3"};
        System.out.println("The name of the Railway Station is:"+name);
        System.out.println("The owner of the Railway Station is:"+owner);
        System.out.println("Address:"+address);
        System.out.println("Services available:");
        for (String service:services){
            System.out.println(service);
        }
        System.out.println("Platforms:");
		for(String platform:platforms) {
			System.out.println(platform);
        }
    }
}
