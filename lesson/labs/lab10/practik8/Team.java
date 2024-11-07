public class Team {
    private final String name;
    private int wins;
    private int losses;
    private int ties;
    private int pointsScored;

    public int getPointsAllowed() {
        return pointsAllowed;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    private int pointsAllowed;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.pointsScored = 0;
        this.pointsAllowed = 0;
    }


    public void recordWin(int scored, int allowed) {
        wins++;
        pointsScored += scored;
        pointsAllowed += allowed;
    }

    public void recordLoss(int scored, int allowed) {
        losses++;
        pointsScored += scored;
        pointsAllowed += allowed;
    }

    public void recordTie(int scored, int allowed) {
        ties++;
        pointsScored += scored;
        pointsAllowed += allowed;
    }

    public String getStatistics() {
        return "\n Статистика по команде '" + name + "'\nПобед: " + wins + ", Паражений: " + losses + ", Ничей:" + ties +
                "\nКол-во забитых голов: " + pointsScored + ", Кол-во пропущенных голов: " + pointsAllowed;
    }
}
