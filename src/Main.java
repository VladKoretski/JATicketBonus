public class Main {
    public static void main(String[] args) {

//Объявление переменных (стоимость билета и бонуса) и ввод их значений с клавиатуры
        float ticketCost = 123345f;
        System.out.println("The cost of a ticket = " + ticketCost + " roubles");
        int costOfFrequentFlyerMile = 20;
        System.out.println("The cost of a frequent mile = " + costOfFrequentFlyerMile + " roubles");
//Объявление переменной для вывода
        int NumberOfFrequentFlyerMiles;

//Проверка корректности введенной переменной стоимость мили и определение начисленных бонусов
        if (costOfFrequentFlyerMile > 0) {
            NumberOfFrequentFlyerMiles = (int) ticketCost / costOfFrequentFlyerMile;
            System.out.println("The bonus amount = " + NumberOfFrequentFlyerMiles + " free miles accrued");
        } else {
            System.out.println("Incorrect format of data. The cost of bonuses must be a none-zero, positive number. Run the program again");
        }
    }
}
