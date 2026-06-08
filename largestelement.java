//Largest in array of 3 elements

import java.util.Scanner;

class largestelement{
    public static void main(String args[]){
        int[] Array = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i <=2;i++){
            System.out.println("Enter the number: ");
            Array[i] = sc.nextInt();
        }

        int largest;
        if(Array[0] < Array[1] && Array[1] > Array[2]){
            largest = Array[1];
        }
        else if(Array[0] > Array[1] && Array[0] > Array[2]){
            largest = Array[0];
        }
        else{
            largest = Array[2];
        }
System.out.println("The largest element is: " + largest);
    }
}