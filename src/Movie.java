import java.util.ArrayList;

public class Movie {

    private String title;
    private String director;
    private double rating;
    private Movie movies;


    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }


    public String getTitle() {
        return this.title;
    }
    public String getDirector() {
        return this.director;
    }
    public double getRating() {
        return this.rating;
    }
    public Movie getMovie() {
        return movies;
    }


    public void setDirector() {
        this.director = director;
    }

    public void settTitle() {
        this.title = title;
    }

    public void setRating() {
        this.rating = rating;
    }


    public String toString() {
        return title + ", " + director + ", " + rating;
    }

//Rate film
    public void setRating(double rating) {
        if (rating > 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Rating need to be in the range 1-10");
        }
    }


//Array af film


    }




