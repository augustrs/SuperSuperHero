package data;

import java.util.ArrayList;

public class Database {

    private ArrayList<Superhero> superheroArrayList = new ArrayList<>();

    public ArrayList<Superhero> getSuperheroArrayList() {
        return superheroArrayList;
    }


    public void addSuperhero(String heroName, String realName, String superPower, int strength, int birthYear, String isHuman) {
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
        ArrayList<Superhero> heroNames = new ArrayList<>();
        boolean herofound = false;
        for (Superhero superhero : superheroArrayList) {
            if (superhero.getHeroName().toLowerCase().trim().contains(superHeroName.toLowerCase())) {
                ArrayList<Superhero> searchResults = new ArrayList<>();
                searchResults.add(superhero);
                herofound = true;
                return searchResults;
            }
        }
        return null;
    }

    public ArrayList<Superhero> findHeroName(String heroName) {
        ArrayList<Superhero> heroNames = new ArrayList<>();
        boolean heroFound = false;
        for (Superhero superhero : superheroArrayList) {
            if (superhero.getHeroName().toLowerCase().contains(heroName.toLowerCase())) {
                heroNames.add(superhero);
                heroFound = true;
            }
        }
        if (!heroFound) {

            System.out.println("Der findes ingen helte i listen med navn: " + "\"" + heroName + "\"");
        }

        return heroNames;



    }


    public void sletSuperhero(Superhero superhero) {
        if (superheroArrayList.contains(superhero)) {
            superheroArrayList.remove(superhero);
        }
    }
}


