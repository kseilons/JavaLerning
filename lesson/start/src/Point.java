package start.src;

/**
 * Этот класс представляет точку на плоскости.
 */
public class Point {
    /**
     * Координата x точки.
     */
    private int x;
    
    /**
     * Координата y точки.
     */
    private int y;
    
    /**
     * Создает точку с заданными координатами.
     * 
     * @param x Координата x
     * @param y Координата y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Возвращает координату x.
     * 
     * @return Координата x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Возвращает координату y.
     * 
     * @return Координата y
     */
    public int getY() {
        return y;
    }
}
