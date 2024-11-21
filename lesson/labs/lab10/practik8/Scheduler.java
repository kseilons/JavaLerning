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
        Scanner sc = new Scanner(System.in);
        getTeams(sc);
    }

    private void getTeams(Scanner sc) {
        int teamCount;
        while (true) {
            System.out.print("Введите кол-во команд, которые хотите задать: ");
            try {
                teamCount = sc.nextInt();
                while (teamCount <= 0 ) {
                    System.out.print("Введите кол-во команд, большее 0:");
                    teamCount = sc.nextInt();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введите число");
                sc.nextLine();
            }
        }


        String a = sc.nextLine();
        for (int i = 0; i < teamCount; i++) {
            System.out.println("Введите название команды");
            String teamName = sc.nextLine();
            teams.add(new Team(teamName));
        }
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
        List<Team> allowedTeam = new ArrayList<>(teams);
        if (allowedTeam.size() == 1) {
            System.out.println("Не получится сыграть в игру, команда всего 1");
            return;
        }
        int gameCount = allowedTeam.size() / 2;
        for (int i = 0; i < gameCount; i++) {
            Team homeTeam = allowedTeam.get(random.nextInt(allowedTeam.size()));
            allowedTeam.remove(homeTeam);
            Team awayTeam;
            do {
                awayTeam = allowedTeam.get(random.nextInt(allowedTeam.size()));
                allowedTeam.remove(awayTeam);
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
        System.out.printf("Средняя температура: %5.2f", averageTemp);
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
