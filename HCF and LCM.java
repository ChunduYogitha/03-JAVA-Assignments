import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        int n1 = 12;
        int n2 = 9;
        int n3 = n1*n2;
        int n = 0;
        while(n1%n2!= 0){
            n = n1%n2;
            n1 = n2;
            n2 = n;
         }
         System.out.println("HCF is : "+n);
         System.out.println("LCM is : " +((n3)/n));
    }
}

/*
  HCF is : 3
  LCM is : 36
*/
