import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedroomList;
    private String conferenceroom;
    private String diningroom;

    public Hotel(String conferenceroom, String diningroom){
        this.bedroomList = new ArrayList<>();
        this.conferenceroom = conferenceroom;
        this.diningroom = diningroom;
    }

    public ArrayList<Bedroom> getBedroomList() {
        return bedroomList;
    }

    public String getConferenceroom() {
        return conferenceroom;
    }

    public String getDiningroom() {
        return diningroom;
    }
}
