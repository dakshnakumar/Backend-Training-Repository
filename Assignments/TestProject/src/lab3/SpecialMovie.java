package lab3;

public class SpecialMovie extends Movie {

    String soundEffects;
    String visualEffects;


    SpecialMovie(String movieName , String producedBy, String directedBy,
                 int duration, int year, String category,
                 String soundEffects, String visualEffects){

        super(movieName ,  producedBy,  directedBy, duration,  year,  category);

        this.soundEffects = soundEffects;
        this.visualEffects = visualEffects;
    }

    public void setSoundEffects(String soundEffects) {
        this.soundEffects = soundEffects;
    }

    public String getSoundEffects() {
        return soundEffects;
    }

    public void setVisualEffects(String visualEffects) {
        this.visualEffects = visualEffects;
    }

    public String getVisualEffects() {
        return visualEffects;
    }





}
