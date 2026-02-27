class GoogleExecutor {
    public static void main(String[] args) {

        System.out.println("Google Login Started");

        Google.login("chaithanyaachar6@gmail.com", "pass@123");
        Google.login(8123119271L);
     
        System.out.println("Google Login Ended");
    }
}