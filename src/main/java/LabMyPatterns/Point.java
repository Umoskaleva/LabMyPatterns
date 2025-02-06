package LabMyPatterns;

public class Point extends GraphObject {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public Point clone() {
        return (Point) super.clone(); // создаем копию
    }

    @Override
    public void draw() {
        System.out.println("Point:" + "(" + getX() + ";" + getY() + ") " + Color.BLUE);
    }
}
