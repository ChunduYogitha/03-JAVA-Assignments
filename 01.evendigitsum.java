1. Sum of even numbers in a digit



--------------------------------------------------------------------------------------------------------------------------
1. sum of even numbers in a digit

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt(); // 123
        int sum = 0;
        while(n>0){
            int rem = n%10; // 3  2   1
            if(rem%2==0){
                sum = sum+rem; // sum = 0  2  2
            }
            n = n/10; // 12  1  0
        }
        System.out.println(sum);
    }
}




//output
Input : 123
output : 2

  
--------------------------------------------------------------------------------------------------------------------------
