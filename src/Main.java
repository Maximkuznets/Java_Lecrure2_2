public class Main {
    public static void main(String[] args) {
        // amount - начальная сумма на счете
        long amount = 100;
        // deposit - сумма пополнения
        long deposit = 1300;
        if (deposit > 1000) {
            long bonus = deposit / 100;
            amount = amount + deposit + bonus;
        } else {
            amount = amount + deposit;
        }
        System.out.println(amount);
    }
}
