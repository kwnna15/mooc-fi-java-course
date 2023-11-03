
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = getGames(file);

        System.out.println("Team:");
        String team = scan.nextLine();

        int numGames = 0;
        int wins = 0;
        int losses = 0;

        for (Game game : games) {
            if (game.getHomeTeam().contains(team)) {
                numGames += 1;
                if (game.getHomeScore() >= game.getAwayScore()) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            } else if (game.getAwayTeam().contains(team)) {
                numGames += 1;
                if (game.getAwayScore() >= game.getHomeScore()) {
                    wins += 1;
                } else {
                    losses += 1;
                }
            }
        }

        System.out.println("Games: " + numGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> getGames(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(",");
                games.add(new Game(split[0], split[1], Integer.valueOf(split[2]), Integer.valueOf(split[3])));
            }
        } catch (Exception e) {
            System.out.println("Failed reading file");
        }

        return games;
    }

}
