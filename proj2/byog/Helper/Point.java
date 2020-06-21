package byog.Helper;

public class Point {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printP() {
        System.out.println(x + "," + y);
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
