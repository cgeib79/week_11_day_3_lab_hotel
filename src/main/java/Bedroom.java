import java.util.ArrayList;

public class Bedroom {
    private String type;
    private int nightrate;
    private ArrayList<Guest> bedroomGuestList;

    public String getType() {
        return type;
    }

    public int getNightrate() {
        return nightrate;
    }

    public ArrayList<Guest> getBedroomGuestList() {
        return bedroomGuestList;
    }

    public Bedroom(String type, int nightrate){
       this.type = type;
       this.nightrate = nightrate;
       this.bedroomGuestList = new ArrayList<>();


    }

    public int getGetNumberOfGuests() {
        return this.bedroomGuestList.size();
    }


    public void AddGuest(Guest guest) {
        this.bedroomGuestList.add(guest);
    }

    public void RemoveGuest(Guest guest) {
        this.bedroomGuestList.remove(guest);
    }
}

