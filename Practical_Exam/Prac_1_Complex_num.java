import java.util.*;
import java.io.*;


class Complex{
    int real1,real2,img1,img2;
    Complex(int r1,int r2,int i1,int i2){
        this.real1=r1;
        this.real2=r2;
        img1=i1;
        img2=i2;
    }
    void add(){
        System.out.println((real1+real2) +" + "+(img1+img2)+"i");
    }
    void sub(){
        int realpart=real1-real2;
        int imgpart=img1-img2;
        if(imgpart<0){
            imgpart=imgpart*-1;
            System.out.println((realpart) +" + "+(imgpart)+"i");
        }
        else{
            System.out.println((realpart) +" - "+(imgpart)+"i");
        }
    }
    void mul(){
        int realpart=(real1*real2)-(img1*img2);
        int imgpart=((real1*img2)+(real2*img1));
        System.out.println((realpart) +" + "+(imgpart)+"i");

    }
    void div(){
        double denominator=(real1*real2)+(img1*img2);
        if (denominator == 0) {
            System.out.println("Error: Division by zero");
            return;
        }
        double realpart=((real1*real2)+(img1*img2))/denominator;
        double imgpart=((img1*real2)-(real1*img2))/denominator;
        System.out.println((realpart) +" + "+(imgpart)+"i");
    }

}
public class prac1 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

        System.out.println("1.ADD");
        System.out.println("2.Subtract");
        System.out.println("3.MUL");
        System.out.println("4.DIVIDE");
        System.out.print("Enter Operation you Want to Perform:");
        int n=sc.nextInt();

        System.out.print("Enter the Real part of 1st Complex number:");
        int real1=sc.nextInt();
        System.out.print("Enter the Imaginary part of 1st Complex number:");
        int img1=sc.nextInt();
        System.out.print("Enter the Real part of 2nd Complex number:");
        int real2=sc.nextInt();
        System.out.print("Enter the Imaginary part of 2nd Complex number:");
        int img2=sc.nextInt();

        Complex obj=new Complex(real1,real2,img1,img2);
        switch(n){
            case 1:
               obj.add();
               break;
            case 2:
                obj.sub();
                break;
            case 3:
                obj.mul();
                break;
            case 4:
                obj.div();
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

    }
}
