public class Theatre {
    public static void main(String[] args) {
        String seats[] ;
        seats = new String[5];
        seats[0] = "Selva";
        seats[1] = "Nandhish";
        seats[4] = "Ab";
        seats[2] = "Su";
        seats[3] = "Selva";

        for(int seatNo = 0; seatNo<seats.length; seatNo++){
            System.out.println(seats[seatNo]);
        }

        Audience audiences[] = new Audience[3];
        Audience selvaReference = new Audience();
        selvaReference.name = "Selva";
        audiences[0] = selvaReference;
        Audience nandishReference = new Audience("Nandish");
        audiences[1] = nandishReference;
        audiences[2] = new Audience("Abhishek");

        for(int i = 0; i<audiences.length; i++){
            System.out.println(audiences[i].name);;
        }
    }
}

class Audience {
    String name;
    Audience(){

    }
    Audience (String audienceName){
        name = audienceName;
    }
}