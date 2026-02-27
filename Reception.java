class Reception {

    public static void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Reception booking appointment");
        System.out.println("Name: " + patientName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);

        Hospital.bookAppointment(patientName, symptom);
    }
}