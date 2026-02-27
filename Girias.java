class Girias {
static String brand;
static String model;
static double price;
static int capacity; // in kg
static String type; // Front/Top Load
static boolean hasDryer;
static String color;
static String energyRating;
static String powerSource;
static String country;

public static boolean createWashingMachine(String wmBrand,String wmModel,double wmPrice,int wmCapacity,
                                           String wmType,boolean dryer,String wmColor,String energy,
                                           String power,String madeIn){
boolean isCreated=false;
boolean validBrand=false, validModel=false, validPrice=false, validCapacity=false,
        validType=false, validDryer=false, validColor=false, validEnergy=false, validPower=false, validCountry=false;

if(wmBrand!=null&&!wmBrand.isEmpty()){brand=wmBrand; validBrand=true;}
if(wmModel!=null&&!wmModel.isEmpty()){model=wmModel; validModel=true;}
if(wmPrice>0){price=wmPrice; validPrice=true;}
if(wmCapacity>0){capacity=wmCapacity; validCapacity=true;}
if(wmType!=null&&!wmType.isEmpty()){type=wmType; validType=true;}
hasDryer=dryer; validDryer=true;
if(wmColor!=null&&!wmColor.isEmpty()){color=wmColor; validColor=true;}
if(energy!=null&&!energy.isEmpty()){energyRating=energy; validEnergy=true;}
if(power!=null&&!power.isEmpty()){powerSource=power; validPower=true;}
if(madeIn!=null&&!madeIn.isEmpty()){country=madeIn; validCountry=true;}

if(validBrand&&validModel&&validPrice&&validCapacity&&validType&&validDryer&&validColor&&validEnergy&&validPower&&validCountry){
isCreated=true;
}
return isCreated;
}

public static void getWashingMachineDetails(){
System.out.println("Washing Machine Details:");
System.out.println("Brand:"+brand);
System.out.println("Model:"+model);
System.out.println("Price:"+price);
System.out.println("Capacity:"+capacity+" kg");
System.out.println("Type:"+type);
System.out.println("Dryer:"+hasDryer);
System.out.println("Color:"+color);
System.out.println("Energy Rating:"+energyRating);
System.out.println("Power Source:"+powerSource);
System.out.println("Country:"+country);
System.out.println("--------------------------------");
}
}