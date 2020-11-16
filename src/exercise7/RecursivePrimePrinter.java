package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        printPrimes(n);
    }

    public static void printPrimes(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        
        if(isPrime(n)){
            System.out.println(n);
        }

        printPrimes(n - 1);
    }


    public static boolean isPrime(int n) {
        boolean prime = true;
        int divider = 2;
        int maxDivider = (int) Math.sqrt(n);

        while(prime && divider <= maxDivider){
            if(n % divider == 0){
                prime = false;
            }
            divider++;
        }
        return prime;
    }
}
