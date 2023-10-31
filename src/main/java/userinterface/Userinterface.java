package userinterface;

import data.Database;

import java.util.Scanner;


public class Userinterface {
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();


    public void StartProgram() {
        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.println("\u2500".repeat(50) + " ");

        System.out.println("Indtast 1 for at oprette en ny superhelt");
        System.out.println("Indtast 2 for at se alle superhelte");
        System.out.println("Indtast 3 for at søge på en superhelt");
        System.out.println("Indtast 4 for at redigere en superhelt");
        System.out.println("Indtast 5 for at slette en superhelt");
        System.out.println("Indtast 9 for at afslutte");
        userInput();
    }

    public void userInput() {
        String input = scanner.nextLine().trim().toLowerCase();
        String[] commands = input.split("\\s+");
        String command = commands[0];

        switch (command) {
            case "1", "et" -> {
                System.out.println("Input your superheros hero name: ");
                String heroName = scanner.nextLine();

                System.out.println("Input your superheros real name: ");
                String realName = scanner.nextLine();

                System.out.println("Input your superheros superpower: ");
                String superPower = scanner.nextLine();

                System.out.println("Input your superheros power level: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("You need to input a number: ");
                    scanner.nextLine();
                }
                int strength = scanner.nextInt();

                System.out.println("Input your superheros birthyear: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("You need to input a number: ");
                    scanner.nextLine();
                }
                int birthYear = scanner.nextInt();
                char human;
                boolean isHuman = true;
                do {
                    System.out.println("Is the superhero a human? [y/n]");
                    human = scanner.next().charAt(0);
                    if (human == 'j') {
                        isHuman = true;
                    } else if (human == 'n') {
                        isHuman = false;
                    } else {
                        System.out.println("Invalid input");
                    }
                } while (human != 'j' && human != 'n');


                database.addSuperhero(heroName, realName, superPower, strength, birthYear, isHuman);
            }
        }
    }





/*
    public void sletSuperHelt(){
        System.out.println("Søg på helten du vil  slette");
        String superheltnavn = keyboard.nextLine();
        ArrayList<Superhelt> resultater = liste.findHeroName(superheltnavn);

        if (resultater.isEmpty()) {
            System.out.println("Ingen matchende superhelte fundet.");
            System.out.println("\u2500".repeat(50));

        } else if (resultater.size() == 1) {
            Superhelt superhelt = resultater.get(0);
            liste.sletSuperhelt(superhelt);
            System.out.println(superhelt.getHeroName() + " er blevet slettet fra databasen.");
            System.out.println("\u2500".repeat(50));
        } else {
            System.out.println("Flere matchende superhelte fundet. Vælg en ved at indtaste nummeret:");
            for (int i = 0; i < resultater.size(); i++) {
                Superhelt superhelt = resultater.get(i);
                System.out.println((i + 1) + ". " + superhelt.getHeroName());
            }

            int valg = Integer.parseInt(keyboard.nextLine());

            if (valg >= 1 && valg <= resultater.size()) {
                Superhelt superhelt = resultater.get(valg - 1);
                liste.sletSuperhelt(superhelt);
                System.out.println(superhelt.getHeroName() + " er blevet slettet fra databasen.");
                System.out.println("\u2500".repeat(50));
            } else {
                System.out.println("Ugyldigt valg.");
            }*/
}


