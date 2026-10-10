public class praktika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите N: ");
        int n = scanner.nextInt();

        System.out.print("цифры справа налево: ");

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
    }
}
