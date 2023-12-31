import java.util.Scanner;

public class Number {

    // метод для конвертации в бинарный формат
    public static String toBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // метод для конвертации в восьмеричный формат
    public static String toOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    // метод для конвертации в шестнадцатеричный формат
    public static String toHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число: ");
        int decimal = scanner.nextInt();

        System.out.print("Введите в какой системе счисления вывести число (2 - бинарная, 8 - восьмеричная, 16 - шестнадцатеричная): ");
        int base = scanner.nextInt();

        if (base == 2) {
            System.out.println("Бинарное представление: " + toBinary(decimal));

        } else if(base == 8) {
            System.out.println("Восьмеричное представление: " + toOctal(decimal));

        } else if(base == 16) {
            System.out.println("Шестнадцатеричное представление: " + toHexadecimal(decimal));

        } else {
            System.out.println("Неизвестная система счисления.");
        }

        scanner.close();
    }
}