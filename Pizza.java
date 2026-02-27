class Pizza {
static String name;
static String size;
static double price;
static boolean isVegetarian;
static String toppings;

public static boolean createFood(String fName,String fSize,double fPrice,boolean veg,String fToppings){
boolean isCreated=false;
boolean validName=false, validSize=false, validPrice=false, validVeg=false, validToppings=false;

if(fName!=null&&!fName.isEmpty()){name=fName; validName=true;}
if(fSize!=null&&!fSize.isEmpty()){size=fSize; validSize=true;}
if(fPrice>0){price=fPrice; validPrice=true;}
isVegetarian=veg; validVeg=true;
if(fToppings!=null&&!fToppings.isEmpty()){toppings=fToppings; validToppings=true;}

if(validName&&validSize&&validPrice&&validVeg&&validToppings){isCreated=true;}
return isCreated;
}

public static void getFoodDetails(){
System.out.println("Food Details:");
System.out.println("Name:"+name);
System.out.println("Size:"+size);
System.out.println("Price:"+price);
System.out.println("Vegetarian:"+isVegetarian);
System.out.println("Toppings:"+toppings);
System.out.println("--------------------------------");
}
}