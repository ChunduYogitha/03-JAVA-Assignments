import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the number : ");
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println("Number is Even");
            }
            else{
                System.out.println("Number is Odd");
            }
        }
        System.out.println("Loop is ended");
    }
}
Enter the limit : 2
Enter the number : 5
Number is Odd
Enter the number : 22
Number is Even
Loop is ended
*/

    Using call method
    
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        int a = sc.nextInt();
        OddOrEven(a);
        }
    }
    static void OddOrEven(int a){
        if(a%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
/*
Enter the limit : 3
2
Even
7
Odd
9
Odd
*/
