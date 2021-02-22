package models;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createInstanceOfSquad() throws Exception{
        Squad squad= new Squad(3, 23, "winners", "sexism");
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void getSquadName_true() throws Exception{
        Squad squad= new Squad(3, 23, "winners", "sexism");
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void getSquadStrength_true() throws Exception{
        Squad squad= new Squad(3, 23, "winners", "sexism");
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void deleteASquad_true() throws Exception{
        Squad squad= new Squad(3, 23, "Breens", "sexism");
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void getSquadWeakness_true() throws Exception{
        Squad squad= new Squad(3, 23, "Breens", "sexism");
        assertEquals(true,squad instanceof Squad);
    }

   }
