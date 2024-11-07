public class Game {
    private static int gameCounter = 1;
    private final int gameId;
    private final int temperature;
    private final Team homeTeam;
    private final Team awayTeam;
    private final int homeScore;
    private final int awayScore;

    public Game(int temperature, Team homeTeam, Team awayTeam) {
        this.gameId = gameCounter++;
        this.temperature = temperature;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = generateScore(temperature);
        this.awayScore = generateScore(temperature);
        updateTeamStatistics();
    }

    private int generateScore(int temperature) {
        return (int) (Math.random() * (Math.max(temperature, 1) / 5 + 2));
    }

    private void updateTeamStatistics() {
        if (homeScore > awayScore) {
            homeTeam.recordWin(homeScore, awayScore);
            awayTeam.recordLoss(awayScore, homeScore);
        } else if (homeScore < awayScore) {
            homeTeam.recordLoss(homeScore, awayScore);
            awayTeam.recordWin(awayScore, homeScore);
        } else {
            homeTeam.recordTie(homeScore, awayScore);
            awayTeam.recordTie(awayScore, homeScore);
        }
    }

    public String getGameStatistics() {
        return "Игра #" + gameId + "\nTemperature: " + temperature +
                "\nHome Team: " + homeTeam.getName() + ", " + homeScore +
                "\nAway Team: " + awayTeam.getName() + ", " + awayScore;
    }
}
