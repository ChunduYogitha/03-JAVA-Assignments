1) Sum of even numbers in a digit
2) Count number of even numbers in a digit




--------------------------------------------------------------------------------------------------------------------------
1) sum of even numbers in a digit

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
Input :
         Enter the digit : 123
output : 
        2

  
--------------------------------------------------------------------------------------------------------------------------
2) Count number of even numbers in a digit

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt(); // 123
        int M = n;
        int count = 0;
        while(n>0){
            int rem = n%10; // 3  2   1
            if(rem%2==0){
                count++; // count = count+1
            }
            n = n/10; // 12  1  0
        }
        System.out.println("The count of Even numder " + M+ " is : "+count);
    }
}

/*12456
rem = 6   5   4.  2. 1
6 even   4.   2
1  2. 3
n/10  1245.  124.   12   1. 0


*/



Input : 
        Enter the digit : 123456
output:
        The count of Even numder 123456 is : 3



--------------------------------------------------------------------------------------------------------------------------









    
