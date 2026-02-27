class Mobile {

    public static void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Mobile app registering patient");

        Reception.book(patientName, symptom, email, mobile);
    }
}