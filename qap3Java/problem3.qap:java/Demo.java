
public class Demo {
    public static void main(String[] args) {
        // Create and display a Point object
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point p1: " + p1);



        // Create and display a MovablePoint object
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("MovablePoint mp1: " + mp1);



        // Move the MovablePoint object and display the new position
        mp1.move();
        System.out.println("MovablePoint mp1 after move: " + mp1);

        

        // Move the MovablePoint object again and display the new position
        mp1.move();
        System.out.println("MovablePoint mp1 after another move: " + mp1);
    }
}
