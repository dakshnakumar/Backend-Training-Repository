package lab3;

public class InternationalMovie extends Movie{

    String country;
    String language;

    InternationalMovie(String movieName , String producedBy, String directedBy,int duration, int year, String category,String country , String language){
        super( movieName ,  producedBy,  directedBy, duration,  year,  category);

        this.country = country;
        this.language = language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}


