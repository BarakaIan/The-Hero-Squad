package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private static ArrayList heroRegistry;
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int defence;
    private int attack;
    private String squadAlliance;
    private static List<Hero> hInstances = new ArrayList<>();
    private static boolean duplicate = false;





    public Hero(String name, int age, String power, String weakness, int defence, int attack) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        this.defence = defence;
        this.attack = attack;
        this.squadAlliance = squadAlliance;
        hInstances.add(this);
        findDuplicateHero(this);
//
//        if (duplicate) {
//            System.out.println("Duplicate Hero!!");
//        } else {
//            heroRegistry.add(this);
//            this.heroID = heroRegistry.size();


        }

    private void findDuplicateHero(Hero hero) {
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//
    public void setAge(int age) {
        this.age = age;
    }
//
    public String getPower() {
        return power;
    }

//
    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }
//
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public static ArrayList getHeroRegistry() {
        return heroRegistry;
    }

    public static void setHeroRegistry(ArrayList heroRegistry) {
        Hero.heroRegistry = heroRegistry;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public static List<Hero> getAll() {
        return hInstances;
    }

//
//      if (duplicate) {
//        System.out.println("Duplicate Hero!!");
//    } else  if{
//        heroRegistry.add(this);
//        this.heroID = heroRegistry.size();
//        this.squadAlliance = "";


    public static void clearHeroRegistry(){
        heroRegistry.clear();
    }

    public String getSquadAlliance() {
        return squadAlliance;
    }

    public void setSquadAlliance(String squadAlliance) {
        this.squadAlliance = squadAlliance;
    }

    public static boolean isDuplicate() {
        return duplicate;
    }

    public static void setDuplicate(boolean duplicate) {
        Hero.duplicate = duplicate;
    }



    public void updateSquad(String newSquad) {
        this.squadAlliance = newSquad;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateAge(int newAge) {
        this.age = newAge;
    }

    public void updatePower(String newPower) {
        this.power = newPower;
    }

    public void updateWeakness(String newWeakness) {
        this.weakness = newWeakness;

//
//    private static void findDuplicateHero(Hero newInsertion) {
//        for (Hero hero : heroRegistry) {
//            if (newInsertion.name.equalsIgnoreCase(hero.name) &&
//                    newInsertion.power.equalsIgnoreCase(hero.power) &&
//                    newInsertion.weakness.equalsIgnoreCase(hero.weakness)) {
//                duplicate = true;
//                break;
//            } else if (newInsertion.name.equalsIgnoreCase(hero.name)) {
//                duplicate = true;
//                break;
//            }
//        }
//    }

//    public static void deleteHero(int searchID) {
//        Hero heroToDelete = findHero(searchID);
//        if (!heroToDelete.getSquadAlliance().equals("")) {
//            Squad currentSquad = null;
//            String currentSquadName = heroToDelete.getSquadAlliance();
//            for (Squad squad : Squad.getAllSquads()) {
//                if (squad.getName().equalsIgnoreCase(currentSquadName)) {
//                    currentSquad = squad;
//                    break;
//                }
//            }
//
//            assert currentSquad != null;
//            currentSquad.removeMember(heroToDelete);
//        }
//        heroRegistry.remove(searchID - 1);
//    }

}
}