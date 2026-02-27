class Nurse {

    public static void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse doing basic check for: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("BP: " + bp);
        System.out.println("Sugar: " + sugar);

        Doctor.treat(patientName, symptom);
    }
}