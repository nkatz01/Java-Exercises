package creditCardDecode;

class Main {
    public static void main(String[] args) {
        boolean even = false;
        // System.out.println("Hello world!");
        // System.out.println("Hello world!");
        // System.out.println(decode(1,even));
        // System.out.println(decode(2,even));
        // System.out.println(decode(3,even));
        // System.out.println(decode(4,even));
        // System.out.println(decode(5,even));
        // System.out.println(decode(6,even));
        // System.out.println(decode(7,even));
        // System.out.println(decode(8,even));
        // System.out.println(decode(9,even));
        // even=!even;
        // System.out.println(decode(1,even));
        // System.out.println(decode(2,even));
        // System.out.println(decode(3,even));
        // System.out.println(decode(4,even));
        // System.out.println(decode(5,even));
        // System.out.println(decode(6,even));
        // System.out.println(decode(7,even));
        // System.out.println(decode(8,even));
        // System.out.println(decode(9,even));

        int num = 2315778;

        System.out.println("CC number: " + num + " is " + checkDigit(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigit(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigit(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigit(num));

    }

    public static int decode(int digit, boolean even) {
        if (!even) {
            return digit;
        } else {
            digit *= 2;
            int findNoOfPosition = digit / 9;
            if (findNoOfPosition < 1) {
                return digit;
            } else {
                findNoOfPosition = (digit % 10);
                digit = 1 + findNoOfPosition;
                return digit;
            }
        }
    }

    public static String checkDigit(int number) {
        int remainder = 0;
        // System.out.println(remainder);
        int sum = 0;
        boolean position = false;
        for (int i = 1; i <= 7; i++) {
            if ((i % 2) != 0)
                position = false;
            else
                position = true;
            if (i < 7)
                remainder = number % 10;
            else
                remainder = number;

            sum += Main.decode(remainder, position);
            number /= 10;

        }
        if ((sum % 10) != 0)
            return "not valid";
        else
            return " valid";
    }

}