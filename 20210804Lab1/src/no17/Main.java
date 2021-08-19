package no17;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int no_number, i=1,current,total=0;
        System.out.println("Enter the amount of numbers: ");
        no_number = Integer.parseInt(s.nextLine());
        while(i <= no_number){
            System.out.println("Enter number " + i + ": ");
            current = s.nextInt();
            total = total + current;
            i++;
        }
        System.out.println("The TOTAL amount of the numbers is "+ total + ".");
        System.out.println("The AVERAGE of the numbers is "+ total/no_number + ".");
    }    
}
