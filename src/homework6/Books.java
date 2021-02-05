package homework6;

import java.time.LocalDate;

/**
 * Created by Gohar Farmanyan
 */

public class Books {
    private final String title;
    private final Authors author;
    private final LocalDate releaseDate;
    private final String category;
    private final Float rating;

    public Books(String title, Authors author, LocalDate releaseDate, String category, Float price) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.category = category;
        this.rating = price;
    }

    public String getTitle() {
        return title;
    }

    public Authors getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("{ title: %s,author: %s, release date: %s, rating: %.2f,category: %s }", title, author.toString(), releaseDate, rating, category);
    }

    private static int createRandomIntBetween(int first, int second) {
        return first + (int) Math.round(Math.random() * (second - first));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }
}
