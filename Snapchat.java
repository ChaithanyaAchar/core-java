class Snapchat{
    static void saveUserAccount(String email,long phonenumber){
        System.out.println("The Email is:"+email);
        System.out.println("The Phone Number is:"+phonenumber);
    }

    public static void main(String[] args){
        saveUserAccount("user@snapchat.com",9888877777L);
    }
}
