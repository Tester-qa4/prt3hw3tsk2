public class beebeeline {
    public static void main(String[] args) {
        int balance = (int) 100f;
        int summTransed = 1100;
        int startBonus = 1000;
        int totalBalance;
        if (summTransed > startBonus) {
            totalBalance = summTransed / 100 + balance + summTransed;
        } else {
            totalBalance = balance + summTransed;
        }
        System.out.println(totalBalance);
    }
}
