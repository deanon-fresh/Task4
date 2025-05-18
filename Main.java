import java.util.Scanner;

public class Main {
public static int year3 = 0; // для сравнения
public static int attempt = 0; // для счетчика

    public static void calculation(int year) {
        if (year % 400 == 0) {
            //System.out.println("Количество дней 366");
            year3 = 366;
        } else if (year % 4 == 0 && year % 100 != 0) {
            //System.out.println("Количество дней 366");
            year3 = 366;
        } else  {
            //System.out.println("Количество дней 365");
            year3 = 365;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите год в формате гггг: ");
            int year = scanner.nextInt();
            System.out.print("Введите количество дней в указанном Вами году: ");
            int year2 = scanner.nextInt();
            calculation(year);
            if (year2 == year3) {
                //System.out.println("Верно, продолжаем");
                attempt++;
            } else {
                break;
                }
            }
        System.out.println("Неправильно! В этом году " + year3 + " дней!");
        System.out.println("Набрано очков: " + attempt);
        }

    }
