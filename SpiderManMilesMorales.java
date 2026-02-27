class SpiderManMilesMorales {
static String title;
static String developer;
static String genre;
static double rating;
static double price;
static String platform;
static boolean isMultiplayer;
static String releaseDate;

public static boolean createGame(String gTitle,String gDeveloper,String gGenre,double gRating,double gPrice,String gPlatform,boolean multiplayer,String gRelease){
boolean isCreated=false;
boolean validTitle=false;
boolean validDev=false;
boolean validGenre=false;
boolean validRating=false;
boolean validPrice=false;
boolean validPlatform=false;
boolean validMulti=false;
boolean validRelease=false;

if(gTitle!=null&&!gTitle.isEmpty()){title=gTitle;validTitle=true;}
if(gDeveloper!=null&&!gDeveloper.isEmpty()){developer=gDeveloper;validDev=true;}
if(gGenre!=null&&!gGenre.isEmpty()){genre=gGenre;validGenre=true;}
if(gRating>=0){rating=gRating;validRating=true;}
if(gPrice>=0){price=gPrice;validPrice=true;}
if(gPlatform!=null&&!gPlatform.isEmpty()){platform=gPlatform;validPlatform=true;}
isMultiplayer=multiplayer;validMulti=true;
if(gRelease!=null&&!gRelease.isEmpty()){releaseDate=gRelease;validRelease=true;}

if(validTitle&&validDev&&validGenre&&validRating&&validPrice&&validPlatform&&validMulti&&validRelease){
isCreated=true;
}
return isCreated;
}

public static void getGameDetails(){
System.out.println("Title:"+title);
System.out.println("Developer:"+developer);
System.out.println("Genre:"+genre);
System.out.println("Rating:"+rating);
System.out.println("Price:"+price);
System.out.println("Platform:"+platform);
System.out.println("Multiplayer:"+isMultiplayer);
System.out.println("Release Date:"+releaseDate);

}
}