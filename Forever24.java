class Forever24{
static String brand;
static String type;
static String size;
static String color;
static double price;
static String material;
static String gender;
static String category;
static String pattern;
static String fit;
static boolean isAvailable;
static String country;

public static boolean createCloth(String b,String t,String s,String c,double p,String m,String g,String cat,String pat,String f,boolean a,String co){
boolean isCreated=false;
boolean v1=false;
boolean v2=false;
boolean v3=false;
boolean v4=false;
boolean v5=false;
boolean v6=false;
boolean v7=false;
boolean v8=false;
boolean v9=false;
boolean v10=false;
boolean v11=false;
boolean v12=false;

if(b!=null&&!b.isEmpty()){brand=b;v1=true;}
if(t!=null&&!t.isEmpty()){type=t;v2=true;}
if(s!=null&&!s.isEmpty()){size=s;v3=true;}
if(c!=null&&!c.isEmpty()){color=c;v4=true;}
if(p>0){price=p;v5=true;}
if(m!=null&&!m.isEmpty()){material=m;v6=true;}
if(g!=null&&!g.isEmpty()){gender=g;v7=true;}
if(cat!=null&&!cat.isEmpty()){category=cat;v8=true;}
if(pat!=null&&!pat.isEmpty()){pattern=pat;v9=true;}
if(f!=null&&!f.isEmpty()){fit=f;v10=true;}
isAvailable=a;v11=true;
if(co!=null&&!co.isEmpty()){country=co;v12=true;}

if(v1&&v2&&v3&&v4&&v5&&v6&&v7&&v8&&v9&&v10&&v11&&v12){
isCreated=true;
}
return isCreated;
}

public static void getCloth(){
System.out.println("Brand:"+brand);
System.out.println("Type:"+type);
System.out.println("Size:"+size);
System.out.println("Color:"+color);
System.out.println("Price:"+price);
System.out.println("Material:"+material);
System.out.println("Gender:"+gender);
System.out.println("Category:"+category);
System.out.println("Pattern:"+pattern);
System.out.println("Fit:"+fit);
System.out.println("Available:"+isAvailable);
System.out.println("Country:"+country);

}
}