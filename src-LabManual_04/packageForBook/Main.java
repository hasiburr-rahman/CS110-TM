package packageForBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        book[] books = new book[5];

        for(int i=0; i< books.length; i++){
            books[i] = new book();
            System.out.println("Book No." + (i+1));
            System.out.println("Enter the ISBN code: ");
            books[i].setIsbn(input.nextInt());
            input.nextLine();
            System.out.println("Enter the Title of the Book: ");
            books[i].setTitle(input.nextLine());
            System.out.println("Enter the number of Pages: ");
            books[i].setPages(input.nextInt());
            System.out.println("Thanks for giving Information");
        }
        for(int i = 0; i < books.length; i++) {
            book.displayAll(books[i]);
        }
        System.out.print("Comapre between book-1 & book-2 : ");
        System.out.println(books[0].compareTo(books[1]));
        System.out.print("Comapre between book-2 & book-3 : ");
        System.out.println(books[1].compareTo(books[2]));
        System.out.print("Comapre between book-3 & book-4 : ");
        System.out.println(books[2].compareTo(books[3]));
        System.out.print("Comapre between book-4 & book-5 : ");
        System.out.println(books[3].compareTo(books[4]));
        System.out.print("Comapre between book-5 & book-1 : ");
        System.out.println(books[4].compareTo(books[0]));

        for(int i=0; i< books.length; i++){
            System.out.println((i+1) + " have more than 500 pages" + Havior(books[i]));
        }

    }

    public static boolean Havior(book b) {
        return b.getPages() > 500;
    }

}
