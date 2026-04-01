public class Main {
    public static void main(String[] args) {

        StudentAccount account = new StudentAccount("GT123", 100);

        account.processPurchase(20);
        account.processPurchase(15);
        account.processPurchase(60);
        account.processPurchase(200); // should fail

        System.out.println("\n--- Account Summary ---");
        account.printSummary();

        System.out.println("\n--- Transaction History ---");
        account.printTransactionHistory();

        StudentManager manager = new StudentManager();

        // Add students
        manager.addStudent("90408898", 100);
        manager.addStudent("90408999", 150);

        // Process purchases
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
        if (s1 != null) s1.printSummary();
        if (s2 != null) s2.printSummary();
    }
}