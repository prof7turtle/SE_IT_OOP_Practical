/*design a base class shape with two double type values and member function to 
  input the data and compute area() for calculating area of shape. Derive two classes 
  Triangle and Rectangle make compute area() as abstract function and redefine this function 
  in the derive class to suit their requirement .Write a program that accepts the dimension 
  of Triangle /Rectangle and display calculated area. Implement dynamic binding.
*/
//package Lab;
import java.util.Scanner;

abstract class shape{
	Scanner sc=new Scanner(System.in);
	double size1;
	double size2;
	abstract void input();
	abstract void compute_area ();
		
	
}

class triangle extends shape{
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.print("Enter Base of Triangle:");
		size1=sc.nextDouble();
		System.out.print("Enter Height of Triangle:");
		size2=sc.nextDouble();
		}
	void compute_area() {
		double area_t=(0.5*size1*size2);
		System.out.print("The area of Triangle is: "+area_t);
		
	}
	
	
	
}

class rectangle extends shape{
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.print("Enter length of rectangle:");
		size1=sc.nextDouble();
		System.out.print("Enter Breadth of rectangle:");
		size2=sc.nextDouble();	
		}
	void compute_area() {
		double area_r=(size1*size2);
		System.out.print("The area of Rectangle is: "+area_r);
	}
	
}

public class Practical_4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Calculate Area of Triangle");
		System.out.println("2.Calculate Area of Rectangle");
		System.out.println("\n"+"Enter Operation You Want to perform: ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			shape t=new triangle();
			t.input();
			t.compute_area();
			break;
			
		case 2:
			shape r=new rectangle();
			r.input();
			r.compute_area();
			break;
			
		default:
			System.out.println("Invalid Input");
			
		}
		
	}
}
