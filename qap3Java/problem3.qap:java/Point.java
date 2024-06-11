
public class Point {
    private float x;
    private float y;

    
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    /**
     * Constructor that initializes x and y to the specified values.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for x coordinate.
     * @return the x coordinate
     */
    public float getX() {
        return x;
    }

    /**
     * Setter for x coordinate.
     * @param x the x coordinate
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Getter for y coordinate.
     * @return the y coordinate
     */
    public float getY() {
        return y;
    }

    /**
     * Setter for y coordinate.
     * @param y the y coordinate
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Getter for both x and y coordinates.
     * @return an array containing x and y coordinates
     */
    public float[] getXY() {
        return new float[]{x, y};
    }

    /**
     * Setter for both x and y coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
