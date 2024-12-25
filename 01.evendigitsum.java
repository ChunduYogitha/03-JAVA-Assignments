1) Sum of even numbers in a digit
2) Count number of even numbers in a digit
3) Sum of even numbers in a digit
4) Sum of even place values
5) Sum of even place values using while loop



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
3)Sum of even numbers in a digit

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        int n = 245678;
        String str = Integer.toString(n); // str = "245678"
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            int b = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(b%2==0){
                sum = sum+b;
            }
        }
        System.out.println(sum);
    }
}


output : 20


--------------------------------------------------------------------------------------------------------------------------
4)Sum of even place values using string
    
import java.io.*;
public class Main{
    public static void main(String[] args){
        int n = 245678;
        String str = Integer.toString(n);
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                int b = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum = sum+b;
            }
        }
        System.out.println(sum);
    }
}

output : 18

--------------------------------------------------------------------------------------------------------------------------
5) Sum of even place values using while loop

import java.io.*;
public class Main{
    public static void main(String[] args){
        int n = 245678;
        int i=0;
        int sum =0;
        while(n>0){
           int rem = n%10;
           i++;
           if(i%2!=0){
               sum = sum+rem;
           }
           n=n/10;
        }
        System.out.println(sum);
    }
}

output : 18

--------------------------------------------------------------------------------------------------------------------------
