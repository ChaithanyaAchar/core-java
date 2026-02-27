class Cipla{
static String medicineName;
static String company;
static double price;
static String type;
static int quantity;
static String expiryDate;
static boolean prescriptionRequired;
static String batchNo;

public static boolean createMedicine(String mName,String comp,double mPrice,String mType,int qty,String exp,boolean pres,String batch){
boolean isCreated=false;
boolean validName=false;
boolean validComp=false;
boolean validPrice=false;
boolean validType=false;
boolean validQty=false;
boolean validExp=false;
boolean validPres=false;
boolean validBatch=false;

if(mName!=null&&!mName.isEmpty()){medicineName=mName;validName=true;}
if(comp!=null&&!comp.isEmpty()){company=comp;validComp=true;}
if(mPrice>0){price=mPrice;validPrice=true;}
if(mType!=null&&!mType.isEmpty()){type=mType;validType=true;}
if(qty>0){quantity=qty;validQty=true;}
if(exp!=null&&!exp.isEmpty()){expiryDate=exp;validExp=true;}
prescriptionRequired=pres;validPres=true;
if(batch!=null&&!batch.isEmpty()){batchNo=batch;validBatch=true;}

if(validName&&validComp&&validPrice&&validType&&validQty&&validExp&&validPres&&validBatch){
isCreated=true;
}
return isCreated;
}

public static void getMedicine(){
System.out.println("Medicine Name:"+medicineName);
System.out.println("Company:"+company);
System.out.println("Price:"+price);
System.out.println("Type:"+type);
System.out.println("Quantity:"+quantity);
System.out.println("Expiry Date:"+expiryDate);
System.out.println("Prescription Required:"+prescriptionRequired);
System.out.println("Batch No:"+batchNo);
System.out.println("----------------------");
}
}