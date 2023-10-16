import java.text.DateFormat;
import java.util.*;

public class Users {

    //User.csv attributes
    ArrayList<Integer> listOfUsersNrCrt;
    ArrayList<String> listOfPlayerNames;
    int nrOfGames;
    DateFormat lastGamePlayed;
    double totalTimePlayedPerUser;


//    public Users(ArrayList<Integer> listOfUsersNrCrt,ArrayList<String> listOfPlayerNames,int nrOfGames, DateFormat lastGamePlayed,double totalTimePlayedPerUser ){
//        this.listOfUsersNrCrt = listOfUsersNrCrt;
//        this.listOfPlayerNames =listOfPlayerNames;
//        this.nrOfGames = nrOfGames;
//        this.lastGamePlayed = lastGamePlayed;
//        this.totalTimePlayedPerUser = totalTimePlayedPerUser;
//    }

//    public static Map<String, Users> createUsersMap(int listOfUsersNrCrt, int listOfPlayerNames,
//                                                    List<String> nrOfGames, ArrayList<String> lastGamePlayed, double totalTimePlayedPerUser) {
//        Map<String, Users> usersMap = new HashMap<>();
//        for (int i = 0; i < listOfPlayerNames.size(); i++) {
//            String playerName = listOfPlayerNames.get(i);
//            Users user = new Users(
//                    (ArrayList<Integer>) Collections.singletonList(listOfUsersNrCrt.get(i)),
//                    (ArrayList<String>) Collections.singletonList(playerName),
//                    (ArrayList<Integer>) Collections.singletonList(nrOfGames.get(i)),
//                    lastGamePlayed,
//                    totalTimePlayedPerUser
//            );
//            usersMap.put(playerName, user);
//        }
//        return usersMap;
//    }

    public Users(int nrOfGames){
        this.nrOfGames =nrOfGames;
    }



    // Getter and Setter for listOfUsersNrCrt
    public ArrayList<Integer> getListOfUsersNrCrt() {
        return listOfUsersNrCrt;
    }

    public void setListOfUsersNrCrt(ArrayList<Integer> listOfUsersNrCrt) {
        this.listOfUsersNrCrt = listOfUsersNrCrt;
    }

    // Getter and Setter for listOfPlayerNames
    public ArrayList<String> getListOfPlayerNames() {
        return listOfPlayerNames;
    }

    public void setListOfPlayerNames(ArrayList<String> listOfPlayerNames) {
        this.listOfPlayerNames = listOfPlayerNames;
    }

    // Getter and Setter for nrOfGames
    public int getNrOfGames() {
        return nrOfGames;
    }

    public void setNrOfGames(int nrOfGames) {
        this.nrOfGames = nrOfGames;
    }

    // Getter and Setter for lastGamePlayed
    public DateFormat getLastGamePlayed() {
        return lastGamePlayed;
    }

    public void setLastGamePlayed(DateFormat lastGamePlayed) {
        this.lastGamePlayed = lastGamePlayed;
    }

    // Getter and Setter for totalTimePlayedPerUser
    public double getTotalTimePlayedPerUser() {
        return totalTimePlayedPerUser;
    }

    public void setTotalTimePlayedPerUser(double totalTimePlayedPerUser) {
        this.totalTimePlayedPerUser = totalTimePlayedPerUser;
    }
}
