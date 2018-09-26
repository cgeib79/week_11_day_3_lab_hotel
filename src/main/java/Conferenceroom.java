import java.util.ArrayList;

public class Conferenceroom {
    private String type;
    private int dayrate;
    private ArrayList<Guest> conferenceroomGuestList;

    public Conferenceroom(String type, int dayrate) {
        this.type = type;
        this.dayrate = dayrate;
        this.conferenceroomGuestList = new ArrayList<>();
    }


    public String getType() {
        return type;
    }


    public int getDayRate() {
        return dayrate;
    }


    public int getGetNumberOfGuests() {
        return conferenceroomGuestList.size();
    }


    public void AddGuest(Guest guest1) {
        conferenceroomGuestList.add(guest1);
    }

    public void RemoveGuest(Guest guest1) {
        conferenceroomGuestList.remove(guest1);
    }
}
