public class Main {
    public static void main(String[] args) {
        int account = 100;
        int payment = 1000;
        int bonus = 1;

        if (payment > 1000){
            int bonus = payment / 100;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (account + payment + bonus));
        } else {
            int bonus = 0;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (account + payment));
        }
    }
}