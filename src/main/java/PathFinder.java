import java.util.*;

public class PathFinder {
//    private final Graph<String> graph;
//    private final String s1;
//    private final String s2;
//    public PathFinder( Graph<String> graph, String s1, String s2){
//        this.graph = graph;
//        this.s1 = s1;
//        this.s2 = s2;
//    }


    public static List<String> findShortestPath(Graph<String> graph, String start, String end) {
        Queue<String> toVisitQueue = new LinkedList<>();
        Set<String> visitedNodes = new HashSet<>();
        Map<String, List<String>> paths = new HashMap<>();
        paths.put(start, List.of(start));
        toVisitQueue.add(start);
        visitedNodes.add(start);

        while (!toVisitQueue.isEmpty()) {
            String node = toVisitQueue.remove();
            if (node.equals(end)) {
                return paths.get(node);
            }
            List<String> neighbours = graph.getNeighbours(node);
            for (String neighbour : neighbours) {
                if (visitedNodes.contains(neighbour)) {
                    continue;
                }
                visitedNodes.add(neighbour);
                toVisitQueue.add(neighbour);
                List<String> previousPath = new ArrayList<>(paths.get(node));
                previousPath.add(neighbour);
                paths.put(neighbour, previousPath);
            }
        }
        return Collections.emptyList();
    }
}
