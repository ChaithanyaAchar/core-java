class ZoomExecutor {
    public static void main(String[] args) {

        System.out.println("Zoom Login Started");

        Zoom.login("chaithanyaachar6@company.com", "zoom@123");
        Zoom.login(8123119271L);
        System.out.println("Zoom Login Ended");
    }
}