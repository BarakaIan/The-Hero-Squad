package models;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HeroTest {
    @Before
    public void setUp() throws Exception {
    }

//    @Test
//    public void newHeroIsCreated_true(){
//        Hero newHero = new Hero("Abdul",18, "Coding", "Sleeping",3);
//        assertTrue(newHero instanceof Hero);
//    }


    @Test
    public void InstantiatesCorrectly_true() {
        Hero hero = new Hero("Abdul", 20, "fly", "die", 3);
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void getHeroName_true() {
        Hero newHero = new Hero("Abdul", 20, "fly", "die", 3);
        assertEquals(true, newHero.getName() instanceof String);
    }
//    @Test
//    public void getHeroAge_int(){
//        Hero newHero = new Hero("Abdul", 20, "fly", "die", 3);
//        assertEquals(true, newHero.getAge() instanceof int);
//    }

    @Test
    public void getHeroPower_true() {
        Hero newHero = new Hero("Abdul", 20, "fly", "die", 3);
        assertEquals(true, newHero.getPower() instanceof String);
    }

    @Test
    public void getHeroWeakness_true() {
        Hero newHero = new Hero("Abdul", 20, "fly", "die", 3);
        assertEquals(true, newHero.getWeakness() instanceof String);
    }



//    @Test
//    public void findHero_searchForHeroById_String() {
//    Hero newHero = new Hero("Abdul", 20, "fly", "die", 3);
//    Hero anotherNewHero = anotherNewHero2("Abdul", 20, "fly", "die", 3);
//    assertEquals("Abdul", Hero.findHero(newHero.getHeroID()).getName());
//}
//    }

////
//
//    @After
//    public void tearDown() throws Exception {
//        Hero.clearHeroRegistry();
//    }
}
