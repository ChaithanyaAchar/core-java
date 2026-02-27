class Otis {
static String brand;
static int maxLoad;
static int currentFloor;
static int totalFloors;
static boolean isWorking;
static String type;
static String country;

public static boolean createElevator(String eBrand,int load,int currFloor,int floors,boolean working,String eType,String madeIn){
boolean isCreated=false;
boolean validBrand=false;
boolean validLoad=false;
boolean validCurrFloor=false;
boolean validTotalFloors=false;
boolean validWorking=false;
boolean validType=false;
boolean validCountry=false;

if(eBrand!=null&&!eBrand.isEmpty()){brand=eBrand; validBrand=true;}
if(load>0){maxLoad=load; validLoad=true;}
if(currFloor>=0){currentFloor=currFloor; validCurrFloor=true;}
if(floors>0){totalFloors=floors; validTotalFloors=true;}
isWorking=working; validWorking=true;
if(eType!=null&&!eType.isEmpty()){type=eType; validType=true;}
if(madeIn!=null&&!madeIn.isEmpty()){country=madeIn; validCountry=true;}

if(validBrand&&validLoad&&validCurrFloor&&validTotalFloors&&validWorking&&validType&&validCountry){
isCreated=true;
}
return isCreated;
}

public static void getElevatorDetails(){
System.out.println("Elevator Details:");
System.out.println("Brand:"+brand);
System.out.println("Max Load:"+maxLoad);
System.out.println("Current Floor:"+currentFloor);
System.out.println("Total Floors:"+totalFloors);
System.out.println("Is Working:"+isWorking);
System.out.println("Type:"+type);
System.out.println("Country:"+country);
}

}