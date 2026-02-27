class KGF {
static String name;
static String hero;
static String heroine;
static String director;
static int releaseYear;
static double rating;

public static boolean createMovie(String mName,String mHero,String mHeroine,String mDirector,int year,double mRating){
boolean isCreated=false;
boolean validName=false;
boolean validHero=false;
boolean validHeroine=false;
boolean validDirector=false;
boolean validYear=false;
boolean validRating=false;

if(mName!=null&&!mName.isEmpty()){name=mName; validName=true;}
if(mHero!=null&&!mHero.isEmpty()){hero=mHero; validHero=true;}
if(mHeroine!=null&&!mHeroine.isEmpty()){heroine=mHeroine; validHeroine=true;}
if(mDirector!=null&&!mDirector.isEmpty()){director=mDirector; validDirector=true;}
if(year>1900){releaseYear=year; validYear=true;}
if(mRating>0){rating=mRating; validRating=true;}

if(validName&&validHero&&validHeroine&&validDirector&&validYear&&validRating){
isCreated=true;
}
return isCreated;
}

public static void getMovieDetails(){
System.out.println("Movie Details:");
System.out.println("Name:"+name);
System.out.println("Hero:"+hero);
System.out.println("Heroine:"+heroine);
System.out.println("Director:"+director);
System.out.println("Release Year:"+releaseYear);
System.out.println("Rating:"+rating);
System.out.println("-----------------------------");
}
}