class Hospital {

    public static void bookAppointment(String patientName, String symptom) {
        System.out.println("Hospital booked appointment for: " + patientName);

        int bp = 120;
        boolean sugar = false;

        Nurse.basicCheck(patientName, symptom, bp, sugar);
    }
}