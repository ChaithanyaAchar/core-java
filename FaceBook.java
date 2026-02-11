class FaceBook{
    public static void main(String[] args){
        createUserAccount("chaithanyaachar6@gmail.com",10101,"06-08-2004","Chaithanya","achar","Chaithanya01",560001,"Chaithanya@01","chaithanya@01");
    }
    static void createUserAccount(String emailId, int userId, String dateOfBirth, String firstName,String lastName, String userName, int zipCode,String password, String repeatPassword) {
        System.out.println("The user mail id is:"+emailId);
        System.out.println("The user id is:"+userId);
        System.out.println("The user date of birth is:"+dateOfBirth);
        System.out.println("The user first name is:"+firstName);
        System.out.println("The user last name is:"+lastName);
        System.out.println("The user user name is:"+userName);
        System.out.println("The user zip code is:"+zipCode);
        System.out.println("The user password is:"+password);
        System.out.println("The user repeat password is:"+repeatPassword);
    }
}
