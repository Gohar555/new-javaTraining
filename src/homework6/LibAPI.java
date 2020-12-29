package homework6;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by Gohar Farmanyan
 */

public class LibAPI {
    public static Authors[] getAuthorsData() {
        Authors authors[] = new Authors[10];
        for (int i = 0; i < authors.length; i++) {
            Authors author = new Authors(LibDataRepo.names[(i + 1) % 7],
                    LibDataRepo.surnames[(i + 1) % 7],
                    (int) (Math.random() * 100));
            authors[i] = author;
        }
        return authors;
    }

    public static Books[] getBookData(Authors authors[]) {
        Books books[] = new Books[100];
        for (int i = 0; i < books.length; i++) {
            Books book = new Books(LibDataRepo.titles[(i + 1) % 7],
                    authors[(int) (Math.random() * authors.length)],
                    Books.createRandomDate(1900, 2000),
                    LibDataRepo.categories[(i + 1) % 7],
                    (float) Math.random() * 10);
            books[i] = book;
        }
        return books;
    }

    public static int getGivenBooksLength(Books[] books, Authors author) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                length++;
            }
        }
        return length;
    }

    public static Books[] getGivenAuthorBooks(Books books[], Authors author) {
        Books givenBooks[] = new Books[getGivenBooksLength(books, author)];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                givenBooks[j++] = books[i];
            }
        }
        return givenBooks;
    }


    public static int getAllBooksLength(Books[] books, String name, String surname) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getAuthor().getName().equals(name) || books[i].getAuthor().getSurname().equals(surname))) {
                length++;
            }
        }
        return length;
    }

    public static Books[] getTopThreeBooks(Books books[], String name, String surname) {
        Books allBooks[] = new Books[getAllBooksLength(books, name, surname)];
        Books topThreeBooks[] = new Books[3];
        int j = 0;
        int k = 0;
        boolean hasFound = false;
        if (name.length() <= 2 || surname.length() <= 2) {
            System.out.println("Please enter 3 characters");
            return new Books[0];
        }
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getAuthor().getName().equals(name) || books[i].getAuthor().getSurname().equals(surname))) {
                allBooks[j] = books[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No Result");
            return new Books[0];
        }
        Arrays.sort(allBooks, LibAPI::compareBooks);
        for (int i = (allBooks.length) - 1; i >= (allBooks.length) - 3; i--) {
            topThreeBooks[k] = allBooks[i];
            k++;
        }
        return topThreeBooks;
    }

    public static int compareBooks(Books book1, Books book2) {
        if (book1 == null && book2 == null)
            return 0;
        if (book1 == null && book2 != null)
            return -1;
        if (book1 != null && book2 == null)
            return 1;
        return book1.getRating().compareTo(book2.getRating());
    }

    public static int getMatchingAuthorsLength(Authors[] authors, String input) {
        int length = 0;
        for (int i = 0; i < authors.length; i++) {
            if (authors[i].getName().contains(input) || authors[i].getSurname().contains(input)) {
                length++;
            }
        }
        return length;
    }

    public static Authors[] getAuthorsMatchingTheInput(Authors[] authors, String input) {
        Authors[] matchingAuthors = new Authors[getMatchingAuthorsLength(authors, input)];
        int j = 0;
        boolean hasFound = false;
        if (input.length() <= 2) {
            System.out.println("Please enter 3 characters");
            return new Authors[0];
        }
        for (int i = 0; i < authors.length; i++) {
            if ((authors[i].getName().contains(input) || authors[i].getSurname().contains(input))) {
                matchingAuthors[j] = authors[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No matching authors found");
        }
        return matchingAuthors;
    }

    public static int getMatchingBooksLength(Books[] books, String input) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().contains(input) || books[i].getCategory().contains(input)) {
                length++;
            }
        }
        return length;
    }

    public static Books[] getBooksMatchingTheInput(Books[] books, String input) {
        Books[] matchingBooks = new Books[getMatchingBooksLength(books, input)];
        int j = 0;
        boolean hasFound = false;
        if (input.length() <= 2) {
            System.out.println("Please enter 3 Characters");
            return new Books[0];
        }
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getTitle().contains(input) || books[i].getCategory().contains(input))) {
                matchingBooks[j] = books[i];
                j++;
                hasFound = true;
            }
        }
        if (!hasFound) {
            System.out.println("No matching books found");
        }
        return matchingBooks;
    }

    public static int getBooksMatchingTheDateLength(Books[] books, LocalDate start, LocalDate end) {
        int length = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getReleaseDate().compareTo(start) >= 0 && books[i].getReleaseDate().compareTo(end) <= 0) {
                length++;
            }
        }
        return length;
    }

    public static Books[] getBooksMatchingTheDate(Books[] books, LocalDate start, LocalDate end) {
        if (start.compareTo(end) > 0) {
            System.out.println("Start date can't be greater than end date");
            return new Books[0];
        }
        Books[] booksMatchingDate = new Books[getBooksMatchingTheDateLength(books, start, end)];
        if (getBooksMatchingTheDateLength(books, start, end) == 0) {
            System.out.println("No results");
        }
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getReleaseDate().compareTo(start) >= 0 && books[i].getReleaseDate().compareTo(end) <= 0) {
                booksMatchingDate[j] = books[i];
                j++;
            }
        }
        return booksMatchingDate;
    }
}
