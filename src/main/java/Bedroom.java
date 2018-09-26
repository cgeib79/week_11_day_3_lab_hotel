import java.util.ArrayList;

public class Bedroom {
    private String type;
    private int nightrate;
    private ArrayList<Guest> bedroomGuestList;
    private int capacity;

    public Bedroom(String type, int nightrate, int capacity){
        this.type = type;
        this.nightrate = nightrate;
        this.capacity = capacity;
        this.bedroomGuestList = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getNightrate() {
        return nightrate;
    }

    public ArrayList<Guest> getBedroomGuestList() {
        return bedroomGuestList;
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

    public int getCapacity() {
        return capacity;
    }
}

