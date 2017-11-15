package com.company;

class Movie{
    private String name;

    Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "no plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark goes nuts";
    }
}

class Smurfs extends Movie{
    public Smurfs() {
        super("Smurfs");
    }

    public String plot(){
        return "little blue people";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot(){
        return "kids treated as guinea pigs";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(){
        super("Forgettable");
    }
}


public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i<11;i++){
	        Movie movie = randomMovie();
            System.out.println("Movie is "+movie.getName() +"\n" +"The plot: "+ movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*4 + 1);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Smurfs();
            case 3:
                return new MazeRunner();
            case 4:
                return new ForgettableMovie();
            default:
                return null;
        }
    }
}
