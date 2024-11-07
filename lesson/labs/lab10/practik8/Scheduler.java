import java.util.*;

public class Scheduler {
    private final List<Team> teams;
    private final List<Game> games;
    private int coldWeeksCount = 0;
    private int totalTemperature = 0;
    private int gamesPlayed = 0;
    private int hottestTemp = Integer.MIN_VALUE;

    public Scheduler() {
        teams = new ArrayList<>();
        games = new ArrayList<>();
        teams.add(new Team("Огурцы"));
        teams.add(new Team("Газмяс"));
        teams.add(new Team("Зенит"));
        teams.add(new Team("Победааа"));
    }

    public void startSeason() {
        Scanner scanner = new Scanner(System.in);

        while (coldWeeksCount < 3) {
            int temperature = getTemperature();

            if (temperature < 0) {
                coldWeeksCount++;
                System.out.println("Слишком холодно для игры.");
                continue;
            }

            coldWeeksCount = 0;
            scheduleGames(temperature);

        }
        printSeasonStatistics();
    }

    public void scheduleGames(int temperature) {
        Random random = new Random();
        totalTemperature += temperature;
        gamesPlayed += 2;
        if (temperature > hottestTemp) {
            hottestTemp = temperature;
        }

        for (int i = 0; i < 2; i++) {
            Team homeTeam = teams.get(random.nextInt(teams.size()));
            Team awayTeam;
            do {
                awayTeam = teams.get(random.nextInt(teams.size()));
            } while (homeTeam == awayTeam);

            Game game = new Game(temperature, homeTeam, awayTeam);
            games.add(game);
            System.out.println(game.getGameStatistics());
        }
    }

    public void printSeasonStatistics() {
        System.out.println("Сезон закончился");
        System.out.println("*********РЕЗУЛЬТАТЫ*********");
        for (Team team : teams) {
            System.out.println(team.getStatistics());
        }

        for (Game game : games) {
            System.out.println(game.getGameStatistics());
        }

        double averageTemp = (double) totalTemperature / gamesPlayed;
        System.out.println("Самая горячая температура: " + hottestTemp);
        System.out.println("Средняя температура: " + averageTemp);
    }


    private int getTemperature() {
        Scanner scanner = new Scanner(System.in);
        int temperature;

        while (true) {
            System.out.print("Введите температуру: ");
            try {
                temperature = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод! Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
        return temperature;
    }
}
