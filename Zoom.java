class Zoom {

    public static void login(String email, String password) {
        System.out.println("Zoom login using Email & Password");
        System.out.println("Email: " + email);
    }

    public static void login(long mobileNumber) {
        System.out.println("Zoom login using Mobile Number + OTP");
        System.out.println("Mobile: " + mobileNumber);
    }
}