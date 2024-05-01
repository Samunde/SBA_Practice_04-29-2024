import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainSportsPlayer {

    public static void main(String[] args) {

        String[] playerInformation = {
                "Emani Barnes QB 27 6.5 237 7 Wyoming 6 BuffaloBills",
                "Damian McBride QB 26 6 210 3 SMU 2 MiamiDolphins",
                "Kelsey Guerra QB 29 6.3 222 8 NorthCarolina 4 NewEnglandPatriots",
                "Leland Burnett RB 24 5.11 190 3 Georgia 9 NewYorkJets",
                "Emberly Hayden RB 24 5.1 216 3 Kentucky 2 BuffaloBills",
                "Leroy Perez RB 25 5.1 203 8 AppalachianState 4 MiamiDolphins",
                "Eleanor Dunn RB 26 5.1 210 3 Maryland 2 NewEnglandPatriots",
                "Dawson O’Connor FB 26 6 244 5 Toledo 8 NewYorkJets",
                "Charli Nunez WR 20 6.4 215 3 FloridaState 4 BuffaloBills",
                "Caden Vazquez WR 24 5.9 178 8 PennState 7 MiamiDolphins",
                "Journee McCann WR 30 6.4 221 3 NorthCarolina 9 NewEnglandPatriots"
                // ... other player data ...
        };

        // Create an array of SportsPlayer objects using the createPlayers method
        SportsPlayer[] players = createPlayers(playerInformation);

        // Now you can access the players array and its elements
        for (SportsPlayer player : players) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", " + player.getPosition() + ", " +
                    player.getAge() + ", " + player.getHeight() + ", " + player.getWeight() + ", " + player.getExperience() + ", " +
                    player.getCollege() + ", " + player.getSalary() + ", " + player.getTeam());

        }

    }

    public static SportsPlayer[] createPlayers(String[] playerInformation) {
        SportsPlayer[] players = new SportsPlayer[playerInformation.length];

        for (int i = 0; i < playerInformation.length; i++) {
            String[] playerData = playerInformation[i].split(" "); // Split each string into individual data points

            // Assuming specific order in playerData:
            String firstName = playerData[0];
            String lastName = playerData[1];
            String position = playerData[2];  // Assuming position is in the third column
            int age = Integer.parseInt(playerData[3]);
            double height = Double.parseDouble(playerData[4]);
            int weight = Integer.parseInt(playerData[5]);
            int experience = Integer.parseInt(playerData[6]);
            String college = playerData[7];
            int salary = Integer.parseInt(playerData[8]);  // Assuming salary is a double
            String team = playerData[9];

            // Create a SportsPlayer object and add it to the array
            players[i] = new SportsPlayer(firstName, lastName, position, age, height, weight, experience, college, salary, team);
        }

        return players;
    }
}