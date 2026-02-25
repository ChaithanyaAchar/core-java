class FaceBook{
    public static void login(String username, String password) {
        System.out.println("Facebook login using Username & Password");
        System.out.println("Username: " + username);
    }
    public static void login(long mobileNumber, String password) {
        System.out.println("Facebook login using Mobile Number & Password");
        System.out.println("Mobile: " + mobileNumber);
    }
    public static void login(String email, int otp) {
        System.out.println("Facebook login using Email & OTP");
        System.out.println("Email: " + email);
    }
}