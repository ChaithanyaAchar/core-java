class LG {
static String brand;
static String model;
static double price;
static int capacity; 
static boolean isDoubleDoor;
static String color;
static String energyRating;
static String compressorType;
static boolean hasWaterDispenser;
static String country;

public static boolean createRefrigerator(String rBrand,String rModel,double rPrice,int rCapacity,boolean doubleDoor,
                                         String rColor,String energy,String compressor,boolean waterDispenser,String madeIn){
boolean isCreated=false;
boolean validBrand=false, validModel=false, validPrice=false, validCapacity=false, validDoubleDoor=false,
        validColor=false, validEnergy=false, validCompressor=false, validWater=false, validCountry=false;

if(rBrand!=null&&!rBrand.isEmpty()){brand=rBrand; validBrand=true;}
if(rModel!=null&&!rModel.isEmpty()){model=rModel; validModel=true;}
if(rPrice>0){price=rPrice; validPrice=true;}
if(rCapacity>0){capacity=rCapacity; validCapacity=true;}
isDoubleDoor=doubleDoor; validDoubleDoor=true;
if(rColor!=null&&!rColor.isEmpty()){color=rColor; validColor=true;}
if(energy!=null&&!energy.isEmpty()){energyRating=energy; validEnergy=true;}
if(compressor!=null&&!compressor.isEmpty()){compressorType=compressor; validCompressor=true;}
hasWaterDispenser=waterDispenser; validWater=true;
if(madeIn!=null&&!madeIn.isEmpty()){country=madeIn; validCountry=true;}

if(validBrand&&validModel&&validPrice&&validCapacity&&validDoubleDoor&&validColor&&validEnergy&&validCompressor&&validWater&&validCountry){
isCreated=true;
}
return isCreated;
}

public static void getRefrigeratorDetails(){
System.out.println("Refrigerator Details:");
System.out.println("Brand:"+brand);
System.out.println("Model:"+model);
System.out.println("Price:"+price);
System.out.println("Capacity:"+capacity+"L");
System.out.println("Double Door:"+isDoubleDoor);
System.out.println("Color:"+color);
System.out.println("Energy Rating:"+energyRating);
System.out.println("Compressor Type:"+compressorType);
System.out.println("Water Dispenser:"+hasWaterDispenser);
System.out.println("Country:"+country);
System.out.println("--------------------------------");
}
}