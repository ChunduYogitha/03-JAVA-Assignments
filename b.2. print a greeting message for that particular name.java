import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        greeting(name);
    }
    static void greeting(String name){
        System.out.println("How are you "+ name);
    }
}
/*
INPUT : Yogitha
OUTPUT : How are you Yogitha
