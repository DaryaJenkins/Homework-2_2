public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int refill = 200;

        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счёте " + (initialBalance + refill + bonus));

    }
}