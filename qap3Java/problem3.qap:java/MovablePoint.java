



/**
 * The MovablePoint class models a point that can be moved by a specified speed along the x and y axes.
 */
public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    /**
     * No-arg constructor that initializes xSpeed and ySpeed to 0.0f.
     */
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    /**
     * Constructor that initializes xSpeed and ySpeed to the specified values.
     * @param xSpeed the speed along the x axis
     * @param ySpeed the speed along the y axis
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructor that initializes x, y, xSpeed, and ySpeed to the specified values.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param xSpeed the speed along the x axis
     * @param ySpeed the speed along the y axis
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Getter for xSpeed.
     * @return the speed along the x axis
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Setter for xSpeed.
     * @param xSpeed the speed along the x axis
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Getter for ySpeed.
     * @return the speed along the y axis
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Setter for ySpeed.
     * @param ySpeed the speed along the y axis
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Getter for both xSpeed and ySpeed.
     * @return an array containing xSpeed and ySpeed
     */
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    /**
     * Setter for both xSpeed and ySpeed.
     * @param xSpeed the speed along the x axis
     * @param ySpeed the speed along the y axis
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Moves the point by the speed along the x and y axes.
     * @return the moved point
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
