import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Database {

    //User.csv attributes
    ArrayList<Integer> listOfUsersNrCrt ;
    ArrayList<String> listOfPlayerNames;
    ArrayList<Integer> nrOfGames;
    DateFormat lastGamePlayed;
    double totalTimePlayedPerUser;



    //GamesForUser.csv attributes
    ArrayList<Integer> listOfGamesNrCrt;
    ArrayList<String> gameID;
    ArrayList<Integer> gameScore;
    int countOfHints;
    int countOfSteps;
    List<String> initialMostEfficientPath;
    ArrayList<String> myPath;
    ArrayList<Double> listOfRuntimeOfAppPerGame;

    ArrayList<Stats> listOfGames ;

    public Database(){
        listOfGames = new ArrayList<Stats>();
    }
    public void writeToCsv(Stats stats) {
        try {
            FileWriter csvWriter = new FileWriter("src/main/java/stats.csv", true);
            for(Stats gameStat : listOfGames){
                // Write CSV header
                csvWriter.append("Hints,Steps,BestPath,MyPath,Time\n");

                // Write object to CSV
                csvWriter.append(String.valueOf(gameStat.getCountOfHints())).append(",");
                csvWriter.append(String.valueOf(gameStat.getCountOfSteps())).append(",");
                List<String> stringListAttribute = gameStat.getInitialMostEfficientPath();
                for (String stringAttribute : stringListAttribute) {
                    csvWriter.append(stringAttribute).append("|");
                }

                List<String> stringListAttribute2 = gameStat.getMyPath();
                for (String stringAttribute : stringListAttribute2) {
                    csvWriter.append(stringAttribute).append("|");
                }

                csvWriter.append(String.valueOf(gameStat.getRuntimeOfAppPerGame()));

                csvWriter.append(",");
                csvWriter.flush();
                csvWriter.close();
            }

        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("|");
        }
        return sb.toString();
    }

    List<String> stringToList(String str) {
        List<String> list = new ArrayList<>();
        String[] tokens = str.split("\\|");
        for (String token : tokens) {
            list.add(token);
        }
        return list;
    }
    public void addStatsToCSV(Stats gameStats) {
        try {
            FileWriter csvWriter = new FileWriter("src/main/java/stats2.csv", true);
            csvWriter.append(String.valueOf(gameStats.getCountOfHints()));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(gameStats.getCountOfSteps()));
            csvWriter.append(",");
            csvWriter.append(listToString(gameStats.getInitialMostEfficientPath()));
            csvWriter.append(",");
            csvWriter.append(listToString(gameStats.getMyPath()));
            csvWriter.append(",");
            csvWriter.append(String.valueOf(gameStats.getRuntimeOfAppPerGame()));
            csvWriter.append("\n");

            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}