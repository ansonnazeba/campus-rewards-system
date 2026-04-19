public class Main {
    public static void main(String[] args) {

        // Simulate a campus rewards system with multiple students
        StudentManager manager = new StudentManager();

        // Add students
        manager.addStudent("90408898", 100);
        manager.addStudent("90408999", 150);

        // Look up students by ID and process purchases
        StudentAccount s1 = manager.getStudent("90408898");
        if (s1 != null) {
            s1.processPurchase(20);
            s1.processPurchase(40);
        }

        StudentAccount s2 = manager.getStudent("90408999");
        if (s2 != null) {
            s2.processPurchase(60);
        }

        System.out.println("\n--- All Students ---");
        manager.printAllStudents();

        System.out.println("\n--- Student Summaries ---");
        if (s1 != null) {
            s1.printSummary();
            System.out.println("Transaction History:");
            s1.printTransactionHistory();
        }
        if (s2 != null) {
            s2.printSummary();
            System.out.println("Transaction History:");
            s2.printTransactionHistory();
        }
    }
}