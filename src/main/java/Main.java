public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000;
        int rublesPerBonus = 100;
        int bonus = ticketPrice / rublesPerBonus;
        System.out.println("Начислено бонусов: " + bonus);
    }
}