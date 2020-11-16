package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = scanner.nextInt();

        int[] numbers = new int[numberCount];
        System.out.println("Enter numbers: ");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }
        System.out.print("Search for number: ");
        int number = scanner.nextInt();

        int numberOccurrences = countNumberOccurrences(number, numbers); 
        System.out.println("Number occurrences: " + numberOccurrences);
    }



    public static int countNumberOccurrences(int number, int[] numbers) {
        int count = 0;
        for (int j : numbers) {
            if (number == j) {
                count++;
            }
        }
        return count;
    }
}



