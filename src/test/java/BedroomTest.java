import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1, guest2, guest3;


    @Before
    public void before(){
        bedroom = new Bedroom("Double", 30);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void canGetNightRate(){
        assertEquals(30, bedroom.getNightrate());
    }

//    @Test
//    public void canGetBedroomGuestList(){
//        assertEquals();
//    }

    @Test
    public void canGetNumberOfGuests(){
        assertEquals(0, bedroom.getGetNumberOfGuests());
    }

    @Test
    public void canAddGuest(){
        bedroom.AddGuest(guest1);
        assertEquals (1, bedroom.getGetNumberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.AddGuest(guest1);
        assertEquals (1, bedroom.getGetNumberOfGuests());
        bedroom.RemoveGuest(guest1);
        assertEquals(0, bedroom.getGetNumberOfGuests());
    }
}
