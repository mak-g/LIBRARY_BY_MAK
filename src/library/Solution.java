package library;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine().trim();
        Book[] books= new Book[n];
        for (int i =0;i<n;i++){
            String bookName =scan.nextLine().trim();
            String authorName=scan.nextLine().trim();
            String ISBN= scan.nextLine().trim();
            books[i]=new Book(bookName,authorName,ISBN);
        }
        for (int i=0;i<books.length;i++){
            System.out.println(books[i]);

        }
        scan.close();
    }
}

