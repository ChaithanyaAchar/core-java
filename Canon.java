class Canon{
static String brand;
static String model;
static double price;
static int megapixels;
static String color;
static String sensorType;
static String batteryType;
static double weight;
static boolean isDSLR;
static String country;

public static boolean createCamera(String brandName,String modelName,double camPrice,int mp,String camColor,String sensor,String battery,double camWeight,boolean dslr,String madeIn){
boolean isCreated=false;
boolean validBrand=false;
boolean validModel=false;
boolean validPrice=false;
boolean validMp=false;
boolean validColor=false;
boolean validSensor=false;
boolean validBattery=false;
boolean validWeight=false;
boolean validDslr=false;
boolean validCountry=false;

if(brandName!=null&&!brandName.isEmpty()){brand=brandName;validBrand=true;}
if(modelName!=null&&!modelName.isEmpty()){model=modelName;validModel=true;}
if(camPrice>0){price=camPrice;validPrice=true;}
if(mp>0){megapixels=mp;validMp=true;}
if(camColor!=null&&!camColor.isEmpty()){color=camColor;validColor=true;}
if(sensor!=null&&!sensor.isEmpty()){sensorType=sensor;validSensor=true;}
if(battery!=null&&!battery.isEmpty()){batteryType=battery;validBattery=true;}
if(camWeight>0){weight=camWeight;validWeight=true;}
isDSLR=dslr;validDslr=true;
if(madeIn!=null&&!madeIn.isEmpty()){country=madeIn;validCountry=true;}

if(validBrand&&validModel&&validPrice&&validMp&&validColor&&validSensor&&validBattery&&validWeight&&validDslr&&validCountry){
isCreated=true;
}
return isCreated;
}

public static void getCameraDetails(){
System.out.println("Brand:"+brand);
System.out.println("Model:"+model);
System.out.println("Price:"+price);
System.out.println("Megapixels:"+megapixels);
System.out.println("Color:"+color);
System.out.println("Sensor Type:"+sensorType);
System.out.println("Battery Type:"+batteryType);
System.out.println("Weight:"+weight);
System.out.println("DSLR:"+isDSLR);
System.out.println("Country:"+country);
System.out.println("----------------------");
}
}