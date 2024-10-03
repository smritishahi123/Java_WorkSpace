public class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, original = num;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
