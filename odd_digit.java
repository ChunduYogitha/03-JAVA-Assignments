1)Sum of odd Postions in a given number
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else {
            for(int i=1; i<=n; i++){
                int rem = n%10;
                if(i%2!=0){
                    sum = sum+rem;    
                }
                n=n/10;
            }
             System.out.println(sum);
        }
    }
}
output
  input : 5432
  output : 6
