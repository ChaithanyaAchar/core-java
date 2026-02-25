class FacebookExecutor {
    public static void main(String[] args) {

        System.out.println("Facebook Login Started");

        Facebook.login("chaithanya", "Chaith6");
        Facebook.login(8123119271L, "mypassword123");
        Facebook.login("chaithanyaachar@gmail.com", 447846);

        System.out.println("Facebook Login Ended");
    }
}