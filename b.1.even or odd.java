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

print only even numbers
    
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
        Even(i);
        }
    }
    static void Even(int i){
        if(i%2 == 0){
            System.out.println(i + " is Even");
        }
    }
}
/*
Enter the limit : 5
2 is Even
4 is Even
*/

print only odd numbers
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
        Even(i);
        }
    }
    static void Even(int i){
        if(i%2 != 0){
            System.out.println(i + " is odd");
        }
    }
}
/*
Enter the number : 6
1 is odd
3 is odd
5 is odd
*/
