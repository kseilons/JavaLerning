package src;

public class PrizeCategory {
    private final String prizeName;
    private final int ticketsRequired;
    private int prizesRemaining;

    public PrizeCategory(String prizeName, int ticketsRequired, int initialPrizes) {
        this.prizeName = prizeName;
        this.ticketsRequired = ticketsRequired;
        this.prizesRemaining = initialPrizes;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public int getPrizesRemaining() {
        return prizesRemaining;
    }

    /**
     *  Проверяет, достаточно ли билетов для получения приза и уменьшает количество оставшихся призов, если достаточно.
     * @param ticketsAvailable Количество доступных билетов.
     * @return true, если приз был получен; false, если недостаточно билетов или призы закончились.
     */
    public boolean claimPrize(int ticketsAvailable) {
        if (prizesRemaining > 0 && ticketsAvailable >= ticketsRequired) {
            prizesRemaining--;
            return true;
        }
        return false;
    }
}
