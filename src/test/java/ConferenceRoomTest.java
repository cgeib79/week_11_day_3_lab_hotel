import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    Conferenceroom conferenceroom;
    Guest guest1, guest2, guest3;

    @Before
    public void before() {
        conferenceroom = new Conferenceroom("The Conference", 30);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();

    }

        @Test
        public void canGetRoomType(){
            assertEquals("The Conference", conferenceroom.getType());
        }

        @Test
        public void canGetDayRate(){
            assertEquals(30, conferenceroom.getDayRate());
        }

        @Test
        public void canGetNumberOfGuests(){
        assertEquals(0, conferenceroom.getGetNumberOfGuests());
    }

        @Test
        public void canAddGuest(){
            conferenceroom.AddGuest(guest1);
            assertEquals (1, conferenceroom.getGetNumberOfGuests());
        }

        @Test
        public void canRemoveGuest(){
            conferenceroom.AddGuest(guest1);
            assertEquals (1, conferenceroom.getGetNumberOfGuests());
            conferenceroom.RemoveGuest(guest1);
            assertEquals(0, conferenceroom.getGetNumberOfGuests());
        }

}
