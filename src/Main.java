//Импорт класса Scanner

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Объявление переменных (стоимость билета и бонуса) и ввод их значений с клавиатуры
        Scanner inData = new Scanner(System.in);
        System.out.println("Input the cost of the ticket ");
        float ticketCost = inData.nextFloat();
        System.out.println("Input the cost of a frequent mile ");
        int costOfFrequentFlyerMile = inData.nextInt();
//Объявление переменной для вывода
        int NumberOfFrequentFlyerMiles;

//Проверка корректности введенной переменной стоимость мили и определение начисленных бонусов
        if (costOfFrequentFlyerMile > 0) {
            NumberOfFrequentFlyerMiles = (int) ticketCost / costOfFrequentFlyerMile;
            System.out.println("The bonus amount = " + NumberOfFrequentFlyerMiles);
        } else {
            System.out.println("Incorrect format of data. The cost of bonuses must be a none-zero, positive number. Run the program again");
        }
    }
}