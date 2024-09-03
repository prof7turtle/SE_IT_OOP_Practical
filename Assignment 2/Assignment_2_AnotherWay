//package lab;
import java.util.Scanner;


class Publication {
    String title;
    double price;
    int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public double saleCopy(int numberOfCopies) {
        return numberOfCopies * price;
    }
}


class Book extends Publication {
    String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public int orderCopies(int orderQuantity) {
        this.copies += orderQuantity;
        return this.copies;
    }
}


class Magazine extends Publication {
    int orderQty;
    String currentIssue;

    public Magazine(String title, double price, int copies, int orderQty, String currentIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    public void receiveNewIssue(String newIssue) {
        this.currentIssue = newIssue;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); 

        Book[] books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter number of copies: ");
            int copies = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            books[i] = new Book(title, price, copies, author);
        }

        System.out.print("\nEnter the number of magazines: ");
        int numMagazines = scanner.nextInt();
        scanner.nextLine(); 

        Magazine[] magazines = new Magazine[numMagazines];

        for (int i = 0; i < numMagazines; i++) {
            System.out.println("\nEnter details for magazine " + (i + 1) + ":");
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter number of copies: ");
            int copies = scanner.nextInt();
            System.out.print("Enter order quantity: ");
            int orderQty = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter current issue: ");
            String currentIssue = scanner.nextLine();

            magazines[i] = new Magazine(title, price, copies, orderQty, currentIssue);
        }

       
        double totalBookSales = 0;
        for (int i = 0; i < numBooks; i++) {
            System.out.print("\nEnter number of additional copies to order for book \"" + books[i].title + "\": ");
            int orderQty = scanner.nextInt();
            int totalCopies = books[i].orderCopies(orderQty);
            double sales = books[i].saleCopy(totalCopies);
            totalBookSales += sales;
            System.out.println("Total sales for book \"" + books[i].title + "\": $" + sales);
        }

        
        double totalMagazineSales = 0;
        for (int i = 0; i < numMagazines; i++) {
            System.out.println("\nCurrent issue of magazine \"" + magazines[i].title + "\": " + magazines[i].currentIssue);
            System.out.print("Enter new issue for magazine \"" + magazines[i].title + "\": ");
            String newIssue = scanner.next();
            magazines[i].receiveNewIssue(newIssue);
            double sales = magazines[i].saleCopy(magazines[i].copies);
            totalMagazineSales += sales;
            System.out.println("Total sales for magazine \"" + magazines[i].title + "\": $" + sales);
        }

       
        double totalSales = totalBookSales + totalMagazineSales;
        System.out.println("\nTotal sales of all publications: $" + totalSales);

        
    }
}
