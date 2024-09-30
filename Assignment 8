/*Write a program to create the student database using Files. Student has Name, and Roll_no,
Implement the file operations such as open ,read ,write and update the student file and display 
the data for few students. */


import java.io.*;
import java.util.Scanner;
class StudentRecords
{
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 public void addRecords() throws IOException
	 {
		 // Create or Modify a file for Database
		 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));
		 String name;
		 int roll_no;
		 String s;
		 boolean addMore = false;
		 // Read Data
		 do
		 {
			 System.out.print("Enter Roll no. : ");
			 roll_no = Integer.parseInt(br.readLine());
			 System.out.print("Enter Name: ");
			 name = br.readLine();
			 // Print to File
			 pw.println(roll_no);
			 pw.println(name);
			 System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : ");
			 s = br.readLine();
			 if(s.equalsIgnoreCase("y"))
			 {
			 addMore = true;
			 System.out.println();
			 }
			 else
			 addMore = false;
		 }while(addMore);
		 pw.close();
		 showMenu();
	 }
	 
	 public void readRecords() throws IOException
	 {
		 try
		 {
			 // Open the file
			 BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
			 String name;
			 String rollno;
			 int i=1;
			 // Read records from the file
			 while((rollno = file.readLine()) != null)
			 {
			 System.out.println("-------------");
			 System.out.println("Roll no. : "+ rollno);
			 System.out.println("Name : "+file.readLine());
			 System.out.println();
			 }
			 file.close();
			 showMenu();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println("\nERROR : File not Found !!!");
		 }
	 }
	 
	 public void clear() throws IOException
	 {
		 // Create a blank file
		 PrintWriter pw = new PrintWriter(new BufferedWriter(new
		 FileWriter("studentRecords.txt")));
		 pw.close();
		 System.out.println("\nAll Records cleared successfully !");
		 for(int i=0;i<999999999;i++); // Wait for some time
		 showMenu();
	 }
	 
	 public void showMenu() throws IOException
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("1 : Add Records\n2 : Display \n3 : Update a Record\n4 : Exit\n\nYour Choice : ");
		 int choice = Integer.parseInt(br.readLine());
		 switch(choice)
		 {
			 case 1:
				 addRecords();
			 break;
			 case 2:
				 readRecords();
			 break;
			 case 3:
				 System.err.println("Enter Your Choice \n1. Update Roll Number\n2. Update Name");
				 int c=sc.nextInt();
				 switch(c) {
				 case  1:
					 System.out.println("Enter Roll no. to be updated:");
					 String toUdateR=sc.next();
					 System.out.println("Enter Updated Roll no.");
					 String UpdatedR=sc.next();
					 updateRecord(toUdateR,UpdatedR);
					 break;
				 case 2:
					 System.out.println("Enter Name to be updated:");
					 String toUdateN=sc.next();
					 System.out.println("Enter Updated Name:");
					 String UpdatedN=sc.next();
					 updateRecord(toUdateN,UpdatedN);
					 break;
				 default:
					
				 }
				 
				 break;
			 case 4:
				 System.exit(1);
			 break;
			 default:
				 System.out.println("\nInvalid Choice !");
			 
		 }
	 }
	 
	 private void updateRecord(String a,String b) {
		// TODO Auto-generated method stub
		Scanner s=null;
		String oldFileName="studentRecords.txt";
		String tempName="temp.txt";
		File oldFile=new File(oldFileName);
		File newFile=new File(tempName);
		try {
			
			FileWriter fw=new FileWriter(tempName,false);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			s=new Scanner(new File(oldFileName));
			
			while(s.hasNext()) {
				String data=s.next();
				if(data.equals(a)) {
					pw.println(b);
				}else {
					pw.println(data);
				}
				
			}
			s.close();
			pw.flush();
			pw.close();
			oldFile.delete();
			File rename=new File(oldFileName);
			newFile.renameTo(rename);
			System.out.println("\t*********RECORD UPDATED***********\n\n");
			showMenu();
			
			
		} catch (Exception e) {
			System.out.println("Error!!");
		}
		
	}

	public static void main(String args[]) throws IOException
	 {
		 StudentRecords call = new StudentRecords();
		 call.showMenu();
	 }
}