package homework6;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Gohar Farmanyan
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get all authors
        System.out.println("All Authors: ");
        Authors authors[] = LibAPI.getAuthorsData();
        LibDataRepo.ArrayToString(authors);
        System.out.println("All Books: ");

        // get all books
        Books books[] = LibAPI.getBookData(authors);
        LibDataRepo.ArrayToString(books);
        System.out.println();
        System.out.println("The books of requested author:");

        //get books of given author
        LibDataRepo.ArrayToString(LibAPI.getGivenAuthorBooks(books, books[2].getAuthor()));
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.println("Enter Surname:");
        String surname = sc.next();

        //get the top 3 books of the given author
        System.out.println("Top 3 books of requested author:");
        Books topThreeBooks[] = LibAPI.getTopThreeBooks(books, name, surname);
        LibDataRepo.ArrayToString(topThreeBooks);
        System.out.println("Input:");
        String input = sc.next();

        //Search all authors matching the given string
        System.out.println("Result:");
        Authors[] matchingAuthors = LibAPI.getAuthorsMatchingTheInput(authors, input);
        LibDataRepo.ArrayToString(matchingAuthors);
        System.out.println("input:");
        String input2 = sc.next();

        //Search all books matching the given string
        System.out.println("Result:");
        Books[] matchingBooks = LibAPI.getBooksMatchingTheInput(books, input2);
        LibDataRepo.ArrayToString(matchingBooks);
        System.out.println("From:(YYYY-MM-DD)");
        String date1 = sc.next();
        LocalDate startDate = LocalDate.parse(date1);
        System.out.println("To:(YYYY-MM-DD)");
        String date2 = sc.next();
        LocalDate endDate = LocalDate.parse(date2);

        //Search all books with release date period
        System.out.println("Books in the given period:");
        Books[] booksMatchingTheDate = LibAPI.getBooksMatchingTheDate(books, startDate, endDate);
        LibDataRepo.ArrayToString(booksMatchingTheDate);
    }
}
