import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        calc();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        if (isPalindrome(input.nextLine().toLowerCase())) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }

    public static void calc() {

        int balance = 500;

        int popcorn = 200;
        int popcornMaxNumber = 2;

        int sandwich = 100;
        int sandwichMaxNumber = 5;

        int coke = 50;
        int cokeMaxNumber = 10;

        for (int p = 0; p < popcornMaxNumber; p++) {

            for (int s = 0; s < sandwichMaxNumber; s++) {

                for (int c = 0; c < cokeMaxNumber; c++) {

                    if ((p * popcorn + s * sandwich + c * coke) - balance == 0) {
                        System.out.println(p + " PopCorn - " + s + " Sandwich " + c + " Coke");
                    }
                }
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int current = number;

        while (current != 0) {
            int lastDigit = current % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            current = current / 10;
        }

        System.out.println("input number " + number);
        System.out.println("reversed number " + reversedNumber);

        return number == reversedNumber;
    }
}