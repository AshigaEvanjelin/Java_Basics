import java.util.Scanner;

class palindrome{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter the number: " + num);

        int original=num;
        int reverse=0;

        while(num!=0){
            int remainder=num%10;
            reverse=reverse*10 + remainder;
            num=num/10;

        }
        if(original==reverse){
            System.out.println("The number " + original + " is a palindrome");
        }
        else{
            System.out.println("The number " + original + "is not a palindrome");
        }
    }
}