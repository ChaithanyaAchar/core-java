class Instagram {

    public static void login(String username, String password) {
        System.out.println("Instagram login using Username & Password");
        System.out.println("Username: " + username);
    }

    public static void login(long mobileNumber) {
        System.out.println("Instagram login using Mobile Number + OTP");
        System.out.println("Mobile: " + mobileNumber);
    }

    public static void login(String email, int otp) {
        System.out.println("Instagram login using Email + OTP");
        System.out.println("Email: " + email);
    }
}