public class Palindrome {
    public static void main(String[] args) {
        int num = 121, reversed = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
