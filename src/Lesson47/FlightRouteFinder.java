package Lesson47;
import java.util.*;

public class FlightRouteFinder {
    public static List<String> findRoute(Map<String, String> directFlights, String start, String end) {
        List<String> route = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        route.add(start);
        visited.add(start);

        if (dfs(directFlights, start, end, route, visited)) {
            return route;
        } else {
            return Collections.emptyList();
        }
    }

    private static boolean dfs(Map<String, String> directFlights, String current, String end, List<String> route, Set<String> visited) {
        if (current.equals(end)) {
            return true;
        }

        String nextCity = directFlights.get(current);

        if (nextCity != null && !visited.contains(nextCity)) {
            route.add(nextCity);
            visited.add(nextCity);

            if (dfs(directFlights, nextCity, end, route, visited)) {
                return true;
            }

            route.remove(route.size() - 1);
            visited.remove(nextCity);
        }

        for (Map.Entry<String, String> entry : directFlights.entrySet()) {
            String from = entry.getKey();
            String to = entry.getValue();

            if (from.equals(current) && !visited.contains(to)) {
                route.add(to);
                visited.add(to);

                if (dfs(directFlights, to, end, route, visited)) {
                    return true;
                }

                route.remove(route.size() - 1);
                visited.remove(to);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Las Vegas");
        System.out.println(route);
    }
}
