package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Movie> movies = new ArrayList<>();

    void addMovie(Movie movie){
        movies.add(movie);
    }

    void showMovieId(){
        for(Movie movie:movies){
            System.out.println(movie.getMovieId());
        }
    }


    void dispaly(){
        System.out.println("The stored movies are");
        for (Movie movie:movies){
            System.out.println(movie.movieName);
        }
    }

    private void printDetails(Movie movie) {
        System.out.println("MovieName: " + movie.getMovieName());
        System.out.println("Produced by: " + movie.getProducedBy());
        System.out.println("Directed by: " + movie.getDirectedBy());
        System.out.println("Duration: " + movie.getDuration());
        System.out.println("year : " + movie.getYear());
        System.out.println("category: " + movie.getCategory());
    }

    private void printDetails(SpecialMovie movie) {
//        Movie movie1 = (Movie) movie;
//        printDetails(movie1);
        printDetails((Movie)movie);
//        System.out.println("MovieName: " + movie.getMovieName());
//        System.out.println("Produced by: " + movie.getProducedBy());
//        System.out.println("Directed by: " + movie.getDirectedBy());
//        System.out.println("Duration: " + movie.getDuration());
//        System.out.println("year : " + movie.getYear());
//        System.out.println("category: " + movie.getCategory());
        System.out.println("visualEffects: " + movie.getVisualEffects());
        System.out.println("soundEffects: " + movie.getSoundEffects());
    }

    private void printDetails(InternationalMovie movie) {
        printDetails((Movie)movie);
        System.out.println("country: " + movie.getCountry());
        System.out.println("language: " + movie.getLanguage());
    }
    void moreDetailsAboutMovie(String movieId){
//        System.out.println("Enter the movieId you want to know about more");
        for (Movie movie:movies){
            if (movie.getMovieId().equals(movieId)) {
                if (movie instanceof SpecialMovie) {
                    SpecialMovie specialMovie = (SpecialMovie) movie;
                    printDetails(specialMovie);
                } else if (movie instanceof InternationalMovie) {
                    // I used Casting here, which means converting variable's data type
                    // from one to another

                    InternationalMovie internationalMovie = (InternationalMovie) movie;
                    printDetails(internationalMovie);
//                    System.out.println("soundEffects "+specialMovie.getSoundEffects());
//                    System.out.println("visualEffects "+ specialMovie.getVisualEffects());
                } else if (movie instanceof Movie) {

                    printDetails(movie);
//                    System.out.println("country"+ internationalMovie.getCountry());
//                    System.out.println("language"+ internationalMovie.getLanguage());
                }
            }
        }
    }

    public static void main(String[] args) {

        //decalaring variables
        int num;
        int num1;

        //For parameters to send Special Movie class
        String soundEffects;
        String visualEffects;

        //For parameters to send International Movie class
        String country;
        String language;

        //
        Scanner input = new Scanner(System.in);
        Main obj = new Main();

        while(true){
            
            System.out.println("1.Add Movie");
            System.out.println("2.Get details about Movie");
//            System.out.println("3.Delete Movie");
            
            num = input.nextInt();
            
            if (num == 1){
                System.out.println("which type of movie you want to add");

                System.out.println("1.Normal Movie");
                System.out.println("2.SpecialType of Movie");
                System.out.println("3.International Movie");
                num1 = input.nextInt();
                input.nextLine();

                if(num1 == 1) {
                    Movie result = CommonValues(input);

                    Movie movie = new Movie(result.movieName, result.producedBy, result.directedBy, result.duration, result.year, result.category);
                    obj.addMovie(movie);
                    System.out.println("Movie added successfully");
                } else if (num1==2) {

                    Movie result = CommonValues(input);

                    System.out.println("Enter the soundEffect type");
                    soundEffects = input.nextLine();

                    System.out.println("Enter the visualEffect type");
                    visualEffects = input.nextLine();
                    input.nextLine();

                    SpecialMovie movie =new SpecialMovie(result.movieName, result.producedBy, result.directedBy, result.duration, result.year, result.category,soundEffects,visualEffects);

                    obj.addMovie(movie);
                    System.out.println("Movie added successfully");
                }
                else if (num1 == 3) {

                    Movie result = CommonValues(input);

                    System.out.println("Enter the country ");
                    country = input.nextLine();

                    System.out.println("Enter the language");
                    language = input.nextLine();
                    input.nextLine();

                    InternationalMovie movie =new InternationalMovie(result.movieName, result.producedBy, result.directedBy, result.duration, result.year, result.category,country,language);

                    obj.addMovie(movie);
                    System.out.println("Movie added successfully");

                }

            } else if (num==2) {
//                System.out.println("Enter the movieId you want to know about");
                obj.dispaly();
                input.nextLine();
                System.out.println("Type yes to know more about movie");
                String receive = input.nextLine();
                if (receive.equals("yes")){
                    System.out.println("Enter the movie id you want to know more about");
                    obj.showMovieId();
                    String receive_movie_id = input.nextLine();
                    obj.moreDetailsAboutMovie(receive_movie_id);

                }
            }
        }


    }

    private static Movie CommonValues(Scanner input) {
        String directedBy;
        int year;
        String movieName;
        String producedBy;
        int duration;
        String category;

        System.out.println("Enter the Movie name");
        movieName = input.nextLine();

        System.out.println("Enter the producerName");
        producedBy = input.nextLine();

        System.out.println("Enter the directorName");
        directedBy = input.nextLine();

        System.out.println("Enter duration");
        duration = input.nextInt();

        System.out.println("Enter year");
        year = input.nextInt();
        input.nextLine();

        System.out.println("Enter category");
        category = input.nextLine();

        Movie result = new Movie(movieName, producedBy, directedBy, duration, year, category,1);
        return result;
    }
}
