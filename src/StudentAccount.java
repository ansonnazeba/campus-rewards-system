import java.util.ArrayList;
import java.util.List;

public class StudentAccount {

    private String studentId;
    private double balance;
    private int points;
    private Tier tier;
    private List<Transaction> history;

    public StudentAccount(String studentId, double initialBalance) {
        this.studentId = studentId;
        this.balance = initialBalance;
        this.points = 0;
        this.tier = Tier.BRONZE;
        this.history = new ArrayList<>();
    }

    public void processPurchase(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid purchase amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        // Deduct balance
        balance -= amount;

        // Calculate and add points
        int earnedPoints = RewardsEngine.calculatePoints(amount);
        points += earnedPoints;

        // Update tier
        tier = RewardsEngine.determineTier(points);

        // Record transaction
        history.add(new Transaction(amount, earnedPoints));

        System.out.println("Purchase successful!");
    }

    public void printSummary() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Balance: $" + balance);
        System.out.println("Points: " + points);
        System.out.println("Tier: " + tier);
    }

    public void printTransactionHistory() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}