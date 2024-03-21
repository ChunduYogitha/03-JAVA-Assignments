import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int SI = Compoundinterest(p,r,n);
        System.out.println("Compound Interest = "+SI);
    }
    static int Compoundinterest(int p, int r, int n){
        int si = p*(1+r/100^n)-p;
        return si;
    }
}
/*
100
20
4
Compound interset = 200
*/
