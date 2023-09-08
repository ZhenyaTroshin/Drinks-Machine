import java.util.Scanner;

import static Helper.DrinksMachine.*;

public class Program {
    public static void main(String[] args) {
        float total = 0f;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a drink (\"stop\" - finish):" + '\n'
                    + "1. Coffee - " + Drinks.coffeePrice + '\n'
                    + "2. Tea - " + Drinks.teaPrice + '\n'
                    + "3. Lemonade - " + Drinks.lemonPrice + '\n'
                    + "4. Mojito - " + Drinks.mojitoPrice + '\n'
                    + "5. Mineral water - " + Drinks.waterPrice + " (water)" + '\n'
                    + "6. Coca-cola - " + Drinks.colaPrice + " (cola)" + '\n'
            );
            String choose = scanner.nextLine();
            String upperCase = choose.toUpperCase();
            if (upperCase.equals("COLA") || upperCase.equals("WATER") || upperCase.equals("TEA") || upperCase.equals("COFFEE") || upperCase.equals("STOP") || upperCase.equals("LEMONADE") || upperCase.equals("MOJITO")) {
                Helper.DrinksMachine.valueOf(upperCase);

                if (Helper.DrinksMachine.valueOf(upperCase) == STOP) {
                    break;
                }

                switch (Helper.DrinksMachine.valueOf(upperCase)) {
                    case COFFEE:
                        System.out.println("You ordered coffee." + '\n');
                        total += Drinks.coffeePrice;
                        break;
                    case TEA:
                        System.out.println("You ordered tea." + '\n');
                        total += Drinks.teaPrice;
                        break;
                    case LEMONADE:
                        System.out.println("You ordered lemonade." + '\n');
                        total += Drinks.lemonPrice;
                        break;
                    case MOJITO:
                        System.out.println("You ordered mojito." + '\n');
                        total += Drinks.mojitoPrice;
                        break;
                    case WATER:
                        System.out.println("You ordered mineral water." + '\n');
                        total += Drinks.waterPrice;
                        break;
                    case COLA:
                        System.out.println("You ordered coca cola." + '\n');
                        total += Drinks.colaPrice;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again." + '\n');
                }
            }else
            {
                System.out.println("Invalid choice. Please try again." + '\n');
            }
        }

        System.out.println("Total cost: " + total + " usd");

    }
}
