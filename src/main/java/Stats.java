import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stats {

    //GamesForUser.csv attributes
    //header for this csv will be Nr.Crt | GameID | GameScore | Nr. of Hints | Nr. of Steps | MostEfficientPath | UserPath | Time
    ArrayList<Integer> listOfGamesNrCrt;
    ArrayList<String> gameID;
    ArrayList<Integer> gameScore;
    int countOfHints;
    int countOfSteps;
    List<String> initialMostEfficientPath;
    ArrayList<String> myPath;
    Double runtimeOfAppPerGame;

    ArrayList<Stats> listOfGames ;

    public Stats(){
        listOfGames = new ArrayList<Stats>();
    }


    public Stats(int countOfHints, int countOfSteps, List<String> initialMostEfficientPath,
                 ArrayList<String> myPath, Double runtimeOfAppPerGame) {
        this.countOfHints = countOfHints;
        this.countOfSteps = countOfSteps;
        this.initialMostEfficientPath = initialMostEfficientPath;
        this.myPath = myPath;
        this.runtimeOfAppPerGame = runtimeOfAppPerGame;
    }

//    public Stats(int countOfHints){
//        this.countOfHints=countOfHints;
//    }

    public ArrayList<Integer> getListOfGamesNrCrt() {
        return listOfGamesNrCrt;
    }

    public void setListOfGamesNrCrt(ArrayList<Integer> listOfGamesNrCrt) {
        this.listOfGamesNrCrt = listOfGamesNrCrt;
    }

    public ArrayList<String> getGameID() {
        return gameID;
    }

    public void setGameID(ArrayList<String> gameID) {
        this.gameID = gameID;
    }

    public ArrayList<Integer> getGameScore() {
        return gameScore;
    }

    public void setGameScore(ArrayList<Integer> gameScore) {
        this.gameScore = gameScore;
    }

    public int getCountOfHints() {
        return countOfHints;
    }

    public void setCountOfHints(int countOfHints) {
        this.countOfHints = countOfHints;
    }

    public int getCountOfSteps() {
        return countOfSteps;
    }

    public void setCountOfSteps(int countOfSteps) {
        this.countOfSteps = countOfSteps;
    }

    public List<String> getInitialMostEfficientPath() {
        return initialMostEfficientPath;
    }

    public void setInitialMostEfficientPath(List<String> initialMostEfficientPath) {
        this.initialMostEfficientPath = initialMostEfficientPath;
    }

    public ArrayList<String> getMyPath() {
        return myPath;
    }

    public void setMyPath(ArrayList<String> myPath) {
        this.myPath = myPath;
    }

    // Getter for runtimeOfAppPerGame
    public Double getRuntimeOfAppPerGame() {
        return runtimeOfAppPerGame;
    }

    // Setter for runtimeOfAppPerGame
    public void setRuntimeOfAppPerGame(Double runtimeOfAppPerGame) {
        this.runtimeOfAppPerGame = runtimeOfAppPerGame;
    }



}
