package data;

import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroArrayList = new ArrayList<>();

    public void addSuperhero(String heroName, String realName, String superPower, int strength, int birthYear, boolean isHuman) {
        superheroArrayList.add(new Superhero(heroName, realName, superPower, strength, birthYear, isHuman));
    }

    public int printSuperheroArrayListSize() {
        return superheroArrayList.size();
    }

    public String printAllSuperheroes() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Superhero superhero : superheroArrayList) {
            stringBuilder.append("\u2500".repeat(50)).append("\n");
            stringBuilder.append(superhero).append("\n");

        }
        return stringBuilder.toString();
    }

    public ArrayList<Superhero> search(String superHeroName) {
        for (Superhero superhero : superheroArrayList) {
            if (superhero.getHeroName().toLowerCase().trim().contains(superHeroName.toLowerCase())) {
                ArrayList<Superhero> searchResults = new ArrayList<>();
                searchResults.add(superhero);
                return searchResults;
            }
        }
        return null;
    }
/*
    public ArrayList<Superhelt> findHeroName(String heroName) {
        ArrayList<Superhelt> heroNames = new ArrayList<>();
        boolean heroFound = false;
        for (Superhelt superhelt : superHelteListe) {
            if (superhelt.getHeroName().toLowerCase().contains(heroName.toLowerCase())) {
                heroNames.add(superhelt);
                heroFound = true;
            }
        }
        if (!heroFound) {
            System.out.println("Der findes ingen helte i listen med navn: " + "\"" + heroName + "\"");
        }


        return heroNames;
    }*/


    public void editSuperhero() {
        Database superheroArrayList = new Database();



    }

    public Superhero selectASuperhero(int selectedSuperheroNumber) {
        ArrayList<Superhero> superheroesToBeSelected = new ArrayList<>();
        return superheroesToBeSelected.get(selectedSuperheroNumber - 1);
    }

    public ArrayList<Superhero> deleteSuperhero(String superHeroName) {
        ArrayList<Superhero> result = search(superHeroName);

        if (!result.isEmpty()) {
            Superhero superhero = result.get(0);
            superheroArrayList.remove(superhero);
            return superheroArrayList;
        }
        if (result.size() > 1) {
            //selectASuperhero()
            return superheroArrayList;
        }
        return result;

    }
/*
    public void sletSuperhelt (Superhero superhero){
        if (superheroArrayList.contains(superhero)) {
            superheroArrayList.remove(superhero);

        } else {
            System.out.println(superhero.getHeroName() + " blev ikke fundet i databasen.");
        }
    }*/

}
