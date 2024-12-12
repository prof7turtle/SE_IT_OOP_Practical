import java.util.*;
import java.io.*;
import java.lang.Exception;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Num:");
        String a=sc.next();
        System.out.print("Enter 2nd Num:");
        String b=sc.next();


        try{
            int num1=Integer.parseInt(a);
            int num2=Integer.parseInt(b);
           int div=num1/num2;
            System.out.println(div);
            System.out.println("Successfully Executed");
        }
        catch(NumberFormatException e){
            System.out.println("Not Valid Data Type:"+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("number cannot be Divided by Zero:"+e.getMessage());
        }
        finally{
            sc.close();
        }

    }
}

