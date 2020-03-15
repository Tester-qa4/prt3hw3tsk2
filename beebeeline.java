public class Beebeeline {
    public static void main(String[] args) {
        int balance = (int) 100f;
        int summTransfer = 1100;
        int startBonus = 1000;
        int totalBalance;
        if (summTransfer > startBonus) {
            totalBalance = summTransfer / 100 + balance + summTransfer;
        } else {
            totalBalance = balance + summTransfer;
        }
        System.out.println(totalBalance);
    }
}
