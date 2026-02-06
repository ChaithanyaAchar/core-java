class Ecommerce{
    public static void main(String[] args){
        String name="Amazon India";
        String owner="Amazon.com Inc.";
        String address="Bangalore, Karnataka, India";
        String services[]={"Online Shopping","Fast Delivery","Customer Support"};
        String categories[]={"Electronics", "Fashion", "Home","Kitchen"};
        System.out.println("The name of the Ecommerce Platform is:"+name);
        System.out.println("The owner of the Ecommerce Platform is:"+owner);
        System.out.println("Address:"+address);
        System.out.println("Services available:");
        for (String service:services) {
            System.out.println(+service);
        }
        System.out.println("Categories:");
		for(String category:categories){
			System.out.println(category);
        }
    }
}
