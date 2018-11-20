package com.dominic;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alens attempt to take over planet earth";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }

}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}



public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println(
                    "Movie #" + i + " " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n"
            );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 4) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
            case 4:
                return new Forgettable();
        }

        return null;
    }
}
