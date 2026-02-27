class WhatsApp{
static String name;
static String developer;
static double size;
static String category;
static double rating;
static long downloads;
static boolean isFree;

public static boolean createApp(String aName,String dev,double appSize,String appCategory,double appRating,long appDownloads,boolean free){
boolean isCreated=false;
boolean validName=false;
boolean validDev=false;
boolean validSize=false;
boolean validCategory=false;
boolean validRating=false;
boolean validDownloads=false;
boolean validFree=false;

if(aName!=null&&!aName.isEmpty()){name=aName;validName=true;}
if(dev!=null&&!dev.isEmpty()){developer=dev;validDev=true;}
if(appSize>0){size=appSize;validSize=true;}
if(appCategory!=null&&!appCategory.isEmpty()){category=appCategory;validCategory=true;}
if(appRating>0){rating=appRating;validRating=true;}
if(appDownloads>0){downloads=appDownloads;validDownloads=true;}
isFree=free;validFree=true;

if(validName&&validDev&&validSize&&validCategory&&validRating&&validDownloads&&validFree){
isCreated=true;
}
return isCreated;
}

public static void getAppDetails(){
System.out.println("App Name:"+name);
System.out.println("Developer:"+developer);
System.out.println("Size:"+size);
System.out.println("Category:"+category);
System.out.println("Rating:"+rating);
System.out.println("Downloads:"+downloads);
System.out.println("Free:"+isFree);
System.out.println("----------------------");
}
}