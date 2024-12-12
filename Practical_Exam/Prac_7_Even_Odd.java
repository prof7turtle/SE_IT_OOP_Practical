import java.util.*;

public class Practical7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input the elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println("List of numbers: " + list);

        // Count even numbers
        int cEven = countEvenNumbers(list);
        System.out.println("Even: " + cEven);

        // Count odd numbers
        int cOdd = countOddNumbers(list);
        System.out.println("Odd: " + cOdd);

        // Count prime numbers
        int cPrime = countPrimeNumbers(list);
        System.out.println("Prime: " + cPrime);

        // Count palindromes
        int cPal = countPalindromes(list);
        System.out.println("Palindromes: " + cPal);
    }

    private static int countEvenNumbers(List<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int countOddNumbers(List<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static int countPrimeNumbers(List<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int countPalindromes(List<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
