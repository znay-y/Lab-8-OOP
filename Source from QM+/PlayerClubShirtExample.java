import java.util.*;

public class PlayerClubShirtExample {
    public static void main(String[] args) {
        // Create the map
        Map<String, Map<String, Integer>> playerMap = new HashMap<>();
        
        // Add data to the map
        addPlayer(playerMap, "Salah", "Liverpool", 11);
        addPlayer(playerMap, "Messi", "Inter Miami", 30);
        addPlayer(playerMap, "Kylian Mbappe", "Paris Saint-Germain", 7);


        // Print the entire map gracefully
        System.out.println("\nPrinting the entire map: ");
        printPlayerMap(playerMap);
        
                
        // Access and print data from the map
        System.out.println("Shirt number of Salah from Liverpool: " + getPlayerShirtNumber(playerMap, "Salah", "Liverpool"));


		// Trying to get the shirt number of a player not in the map
        System.out.println("\nShirt number of Neymar from PSG: " + getPlayerShirtNumber(playerMap, "Neymar", "PSG"));


    }
    
    // Method to add a player's data to the map
    public static void addPlayer(Map<String, Map<String, Integer>> playerMap, String playerName, String club, int shirtNumber) {
        // If the club doesn't exist in the map, create a new map for it
        playerMap.putIfAbsent(playerName, new HashMap<>());
        
        // Get the map for the club and add the player's shirt number
        playerMap.get(playerName).put(club, shirtNumber);
    }
    
    // Method to get a player's shirt number from the map
    public static Integer getPlayerShirtNumber(Map<String, Map<String, Integer>> playerMap, String playerName, String club) {
        // If the player or club doesn't exist in the map, return null
        if (!playerMap.containsKey(playerName) || !playerMap.get(playerName).containsKey(club)) {
            return null;
        }
        
        // Return the player's shirt number
        return playerMap.get(playerName).get(club);
    }
    
    
    
    // Method to print the entire map gracefully
    public static void printPlayerMap(Map<String, Map<String, Integer>> playerMap) {
        for (Map.Entry<String, Map<String, Integer>> entry : playerMap.entrySet()) {
            String playerName = entry.getKey();
            Map<String, Integer> clubMap = entry.getValue();
            
            System.out.println("Player: " + playerName);
            System.out.println("Clubs and Shirt Numbers:");
            for (Map.Entry<String, Integer> clubEntry : clubMap.entrySet()) {
                String club = clubEntry.getKey();
                Integer shirtNumber = clubEntry.getValue();
                System.out.println("- Club: " + club + ", Shirt Number: " + shirtNumber);
            }
            System.out.println(); // Empty line for better readability
        }
    }
}
