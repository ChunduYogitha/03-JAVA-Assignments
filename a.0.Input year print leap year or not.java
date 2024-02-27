import java.io.*;
public class Main{
    public static void main(String[] args){
        int n = 2002;
        if(n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
  OUTPUT : Not Leap Year


import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}

INPUT : 2016
OUTPUT : Leap Year
