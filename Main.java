import java.util.Scanner;

public class Main {
public static int daysUsers = 0; // для сравнения
public static int attempt = 0; // для счетчика

    public static int calculation(int year) {
        if (year % 400 == 0) {
            //System.out.println("Количество дней 366");
            daysUsers = 366;
        } else if (year % 4 == 0 && year % 100 != 0) {
            //System.out.println("Количество дней 366");
            daysUsers = 366;
        } else  {
            //System.out.println("Количество дней 365");
            daysUsers = 365;
        }
    return daysUsers;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите год в формате гггг: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней в указанном Вами году: ");
            int days = scanner.nextInt();
            int daysUsers = calculation(year);
            if (days == daysUsers) {
                //System.out.println("Верно, продолжаем");
                attempt++;
            } else {
                break;
                }
            }
        System.out.println("Неправильно! В этом году " + daysUsers + " дней!");
        System.out.println("Набрано очков: " + attempt);
        }

    }
