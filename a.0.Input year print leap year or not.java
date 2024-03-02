Input a year and find whether it is a leap year or not
    import java.io.*;
    public class Main{
        public static void main(String[] args){
            int Year = 1900;
            boolean isLeapYear = false;
            if(Year % 4 ==0){
                if(Year % 100 == 0){
                    if(Year % 400 == 0){
                        isLeapYear = true;
                    }
                }
                else{
                    isLeapYear = false;
                }
            }
            if(isLeapYear){
                System.out.println("leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
    }

/* 
    OUTPUT : not a leap year
*/
