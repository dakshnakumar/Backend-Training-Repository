package lab3;

import java.util.ArrayList;

public class Movie {

    public static int moviesCount;
    private String movieId;

    static ArrayList<Movie> movies = new ArrayList<>();

    String movieName ;
    String producedBy;
    String directedBy;
    int duration;
    int year;
    String category;
    int dummy;

    Movie(String movieName , String producedBy, String directedBy,int duration, int year, String category,int dummy){
        this(movieName,producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
        this.dummy = dummy;
    }

    Movie(String movieName , String producedBy, String directedBy,int duration, int year, String category){
        this(movieName,producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;

        moviesCount = moviesCount + 1;

        GenerateMovieId();
    }

    Movie(String movieName , String producedBy){

        this.movieName = movieName;
        this.producedBy = producedBy;
    }


    final void GenerateMovieId(){
        this.movieId = this.movieName+"_"+this.moviesCount;
    }

    //setter and getters

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void addMovies(Movie object){
        movies.add(object);
    }

    public String getMovieId() {
        return movieId;
    }

}
