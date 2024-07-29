import java.util.Scanner;

class Complex{
    public
    int real1,real2,img1,img2;

    public Complex(int a, int b, int c, int d) {
        this.real1=a;
        this.img1=b;
        this.real2=c;
        this.img2=d;
    }


    void add(){
        int realpart=real1+real2;
        int imgpart=img1+img2;
        System.out.println(realpart+"+"+imgpart+"i");
    }

    void Subtract(){
        int realpart=real1-real2;
        int imgpart=img1-img2;
        if(imgpart<0){
            imgpart=imgpart*(-1);
            System.out.println(realpart+"-"+imgpart+"i");
        }
        else{
            System.out.println(realpart+"+"+imgpart+"i");
        }
    }

    void mul(){
        int realpart=((real1*real2)-(img1*img2));
        int imgpart=((real1*img2)+(real2*img1));
        System.out.println(realpart+"+"+imgpart+"i");
    }

    void div(){
        double realpart=(((real1*real2)+(img1*img2))/((real2*real2)+(img2*img2)));
        double imgpart=(((img1*real2)-(real1*img2))/((real2*real2)+(img2*img2)));
        System.out.println(realpart+"+"+imgpart+"i");
    }
}

public class lab1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("List of Operations");
        System.out.println("------------------------------------------------");
        System.out.println("1.Addition               2.Subtratction");
        System.out.println("3.Multiplication         4.Division");
        System.out.print("Enter Operation you want to perform: ");
        int n=sc.nextInt();
        System.out.println("------------------------------------------------");


        System.out.print("Enter The Real Part of 1st Complex Number: ");
        int a=sc.nextInt();
        System.out.print("Enter The Imaginary Part of 1st Complex Number: ");
        int b=sc.nextInt();
        System.out.println("The 1st Complex Number is: "+a+"+"+b+"i");
        System.out.println("");

        System.out.print("Enter The Real Part of 2nd Complex Number: ");
        int c=sc.nextInt();
        System.out.print("Enter The Imaginary Part of 2nd Complex Number: ");
        int d=sc.nextInt();
        System.out.println("The 2nd Complex Number is: "+c+"+"+d+"i");
        System.out.println("");


        Complex com = new Complex(a,b,c,d);
        switch(n){
            case 1:
                System.out.print("The Addition of Complex Number is: ");
                com.add();
                break;
            case 2:
                System.out.print("The Subtraction of Complex Number is: ");
                com.Subtract();
                break;
            case 3:
                System.out.print("The Multiplication of Complex Number is: ");
                com.mul();
                break;
            case 4:
                System.out.print("The Division of Complex Number is: ");
                com.div();
                break;
            default:
                System.out.println("invalid Input");
                break;
        }
    }
}

//Output
/* *****************************************************

Enter The Real Part of 1st Complex Number: 2
Enter The Imaginary Part of 1st Complex Number: 3
The 1st Complex Number is: 2+3i

Enter The Real Part of 2nd Complex Number: 4
Enter The Imaginary Part of 2nd Complex Number: 5
The 2nd Complex Number is: 4+5i


1.Output for Addition

List of Operations
------------------------------------------------
1.Addition               2.Subtratction
3.Multiplication         4.Division
Enter Operation you want to perform: 1
------------------------------------------------
The Addition of Complex Number is: 6+8i

2.Output for Subtraction

List of Operations
------------------------------------------------
1.Addition               2.Subtratction
3.Multiplication         4.Division
Enter Operation you want to perform: 2
------------------------------------------------
The Subtraction of Complex Number is: -2-2i

3.Output for Multiplication

List of Operations
------------------------------------------------
1.Addition               2.Subtratction
3.Multiplication         4.Division
Enter Operation you want to perform: 3
------------------------------------------------
The Multiplication of Complex Number is: -7+22i

4.Output For Division

List of Operations
------------------------------------------------
1.Addition               2.Subtratction
3.Multiplication         4.Division
Enter Operation you want to perform: 4
------------------------------------------------
The Division of Complex Number is: 0.560 + 0.048i


 */
