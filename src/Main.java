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
    }
}