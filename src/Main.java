public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int bonus;
        if (amount < 1000) {
            bonus = 0;
        } else {
            bonus = amount / 100;
        }
        System.out.printf("You bonus: ");
        System.out.println(bonus);
        balance = balance + amount + bonus;
        System.out.printf("You balance: ");
        System.out.println(balance);
    }
}

