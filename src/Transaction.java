import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private int pointsAwarded;
    private LocalDateTime timestamp;

    public Transaction(double amount, int pointsAwarded) {
        this.amount = amount;
        this.pointsAwarded = pointsAwarded;
        this.timestamp = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public int getPointsAwarded() {
        return pointsAwarded;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", points=" + pointsAwarded +
                ", time=" + timestamp +
                '}';
    }
}