class PostOffice{
    public static void main(String[] args){
        String name="Main Post Office";
        String owner="Department of Post";
        String address="MG Road,Bangalore,Karnataka - 560001";
        String services[]={"Postal Services","Banking","Insurance"};
        String branches[]={"Rajajinagar","Mejestic","Jayanagar"};
        System.out.println("The name of the Post Office is:"+name);
        System.out.println("The owner of the Post Office is:"+owner);
        System.out.println("Address:"+address);
        System.out.println("Services offered:");
        for (String service:services){
            System.out.println(service);
        }
        System.out.println("Branches:");
        for (String branch: branches){
            System.out.println(branch);
        }
    }
}