public class beebeeline {
    public static void main(String[] args) {
            int balance = (int)100f;
            int summ_transed = 1100;
            int start_bonus = 1000;
            int total_balance;
            if (summ_transed > start_bonus) {
            total_balance = summ_transed / 100 + balance + summ_transed;
            }
            else {
                total_balance = balance + summ_transed;
            }
        System.out.println(total_balance);
    }
}
