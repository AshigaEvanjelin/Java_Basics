// A leap year is a year that is divisible by 4 but not by 100, except if it is also divisible by 400.

import java.util.Scanner;

class LeapYear {

    void display(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("The year " + y + " is a leap year");
        } else {
            System.out.println("The year " + y + " is not a leap year");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        LeapYear l = new LeapYear();
        l.display(year);

        sc.close();
    }
}