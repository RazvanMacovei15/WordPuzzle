import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordsDictionary {

    private final List<String> words;

    public WordsDictionary(String dictionaryPath) throws IOException{
        this.words = Files.readAllLines(Paths.get(dictionaryPath));
    }

    public List<String> getWords() {
        return words;
    }

    public Map<String, List<String>> getWordsGroupedByWildcard() {
        Map<String, List<String>> neighbouringNodesOfWildcard = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String wildCard = word.substring(0, i) + "*" + word.substring(i + 1);
                if (!neighbouringNodesOfWildcard.containsKey(wildCard)) {
                    neighbouringNodesOfWildcard.put(wildCard, new ArrayList<>());
                }
                List<String> nodesForWildcard = neighbouringNodesOfWildcard.get(wildCard);
                nodesForWildcard.add(word);
            }
        }
        return neighbouringNodesOfWildcard;
    }

}




