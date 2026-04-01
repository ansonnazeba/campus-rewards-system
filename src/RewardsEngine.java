public class RewardsEngine {

    // Calculate points: 1 point per $5 spent
    public static int calculatePoints(double amount) {
        return (int) (amount / 5);
    }

    // Determine tier based on total points
    public static Tier determineTier(int points) {
        if (points >= 500) {
            return Tier.GOLD;
        } else if (points >= 200) {
            return Tier.SILVER;
        } else {
            return Tier.BRONZE;
        }
    }
}