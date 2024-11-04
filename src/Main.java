import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String binaryInput = scanner.nextLine();

        // Преобразование двоичного числа в десятичное
        int decimalValue = Integer.parseInt(binaryInput, 2);
        System.out.println("Десятичное представление: " + decimalValue);

        // Преобразование десятичного числа в BCD
        String bcdResult = convertToBCD(decimalValue);

        System.out.println("BCD представление: " + bcdResult);
    }

    public static String convertToBCD(int decimal) {
        StringBuilder bcd = new StringBuilder();

        // Перебор каждой цифры десятичного числа
        String decimalString = Integer.toString(decimal);
        for (char digit : decimalString.toCharArray()) {
            int digitValue = Character.getNumericValue(digit);
            String binaryString = String.format("%4s", Integer.toBinaryString(digitValue)).replace(' ', '0');
            bcd.append(binaryString).append(" ");
        }

        return bcd.toString().trim();
    }
}