class Patient {

    public static void sick() {
        String name = "Ramesh";
        String symptom = "Fever";
        String email = "ramesh@gmail.com";
        long mobile = 9876543210L;
        Mobile.register(name, symptom, email, mobile);
    }
}