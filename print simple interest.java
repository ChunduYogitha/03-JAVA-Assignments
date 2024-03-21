import java.io.*;
public class Main{
    public static void main(String[] args){
        int p = 100;
        int t = 12;
        int r = 10;
        int si =  Simpleinterest(p,t,r);
       System.out.println("SimpleIntereset = " +si);
    }
    static int Simpleinterest(int p,int t,int r){
         int SI = (p*t*r)/100;
         return SI;
    }
}
/*
SimpleIntereset = 120
*/

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amout = " );
       int p = sc.nextInt();
       System.out.print("Time = " );
       int t = sc.nextInt();
       System.out.print("Rate = ");
       int r = sc.nextInt();
       int si = SimpleInterest(p,t,r);
       System.out.println("Simple Interest = "+ si);
    }
    static int SimpleInterest(int p, int t, int r){
        int SI = (p*t*r)/100;
        return SI;
    }
}
Principal amout = 500
Time = 10
Rate = 5
Simple Interest = 250
*/
