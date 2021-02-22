package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Squad {

    private int maxSize;
    private String name;
    private String cause;
    private int plusSize;
    private static boolean isRegisteredHero = false;
    private ArrayList<Hero> heroes;
    private static List<Object> members = new ArrayList<>();


    public Squad(int maxSize, String name, String cause) {
        this.maxSize = maxSize;
        this.name = name;
        this.cause = cause;
        members.add(this);
        plusSize = members.size();

    }


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }


    public int getPlusSize() {
        return plusSize;
    }

    public static List<Object> getMembers() {
        return members;
    }


    public static boolean whoIsTheHeroInSquad(Hero hero){

        return members.contains(hero);
    }

}
